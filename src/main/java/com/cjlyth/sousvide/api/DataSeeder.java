package com.cjlyth.sousvide.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cjlyth.sousvide.api.dao.ConfigurationDao;
import com.cjlyth.sousvide.api.dao.LogEntryDao;
import com.cjlyth.sousvide.api.entity.Configuration;
import com.cjlyth.sousvide.api.entity.LogEntry;

@Component
public class DataSeeder implements CommandLineRunner{

	private ConfigurationDao configurationDao;
	private LogEntryDao logEntryDao;
	
	
	@Autowired
	public DataSeeder(ConfigurationDao configurationDao, LogEntryDao logEntryDao) {
		this.configurationDao = configurationDao;
		this.logEntryDao = logEntryDao;
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Configuration> configurations = new ArrayList<>();

		configurations.add(new Configuration("1",135.0, "c", new Date(), 90));
		configurations.add(new Configuration("2",134.6, "c", new Date(), 90));
		configurations.add(new Configuration("3",133.9, "c", new Date(), 90));
		
		configurationDao.save(configurations);

		logEntryDao.save(getTempLogs());
		//tempLogEntryDao.save(getTempLogEntries());
//		tempLogDao.save(getTempLogs());
	}
	
	private List<LogEntry> getTempLogs() {
		List<LogEntry> logEntries = new ArrayList<>();
		logEntries.add(new LogEntry(System.currentTimeMillis(), 60.0));
		return logEntries;
	}
}
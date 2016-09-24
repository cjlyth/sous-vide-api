package com.cjlyth.sousvide.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cjlyth.sousvide.api.dao.ConfigurationDao;
import com.cjlyth.sousvide.api.dao.TempLogDao;
import com.cjlyth.sousvide.api.dao.TempLogEntryDao;
import com.cjlyth.sousvide.api.entity.Configuration;
import com.cjlyth.sousvide.api.entity.TempLog;
import com.cjlyth.sousvide.api.entity.TempLogEntry;

@Component
public class DataSeeder implements CommandLineRunner{

	private ConfigurationDao configurationDao;
	private TempLogDao tempLogDao;
	private TempLogEntryDao tempLogEntryDao;
	
	@Autowired
	public DataSeeder(ConfigurationDao configurationDao, TempLogDao tempLogDao, TempLogEntryDao tempLogEntryDao) {
		this.configurationDao = configurationDao;
		this.tempLogDao = tempLogDao;
		this.tempLogEntryDao = tempLogEntryDao;
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Configuration> configurations = new ArrayList<>();

		configurations.add(new Configuration("1",135.0, "c", new Date(), 90));
		configurations.add(new Configuration("2",134.6, "c", new Date(), 90));
		configurations.add(new Configuration("3",133.9, "c", new Date(), 90));
		
		configurationDao.save(configurations);
		
//		tempLogDao.save(getTempLogs());
		tempLogEntryDao.save(getTempLogEntries());
//		tempLogDao.save(getTempLogs());
	}
	
	private List<TempLog> getTempLogs() {
		List<TempLog> tempLogs = new ArrayList<>();
		Date date = new Date();
		tempLogs.add(new TempLog(20, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(25, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(30, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(45, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(32, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(10, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(15, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(18, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(24, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(45, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(180, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(270, date, date, getTempLogEntries()));
		tempLogs.add(new TempLog(90, date, date, getTempLogEntries()));
		return tempLogs;
	}
	private List<TempLogEntry> getTempLogEntries() {
		List<TempLogEntry> tempLogEntries = new ArrayList<>();
		tempLogEntries.add(new TempLogEntry(130.5, "c", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(140.7, "c", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(150.5, "c", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(160.3, "c", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(170.5, "f", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(180.2, "f", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(190.0, "f", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(200.5, "f", System.currentTimeMillis()/1000L));
		tempLogEntries.add(new TempLogEntry(210.0, "f", System.currentTimeMillis()/1000L));
		return tempLogEntries;
	}

}

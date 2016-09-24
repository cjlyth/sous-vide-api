package com.cjlyth.sousvide.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cjlyth.sousvide.api.dao.ConfigurationDao;
import com.cjlyth.sousvide.api.dao.TempLogDao;
import com.cjlyth.sousvide.api.entity.Configuration;
import com.cjlyth.sousvide.api.entity.TempLog;

@Component
public class DataSeeder implements CommandLineRunner{

	private ConfigurationDao configurationDao;
	private TempLogDao tempLogDao;
	
	
	@Autowired
	public DataSeeder(ConfigurationDao configurationDao, TempLogDao tempLogDao) {
		this.configurationDao = configurationDao;
		this.tempLogDao = tempLogDao;
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Configuration> configurations = new ArrayList<>();

		configurations.add(new Configuration("1",135.0, "c", new Date(), 90));
		configurations.add(new Configuration("2",134.6, "c", new Date(), 90));
		configurations.add(new Configuration("3",133.9, "c", new Date(), 90));
		
		configurationDao.save(configurations);
		
		//tempLogDao.save(getTempLogs());
		//tempLogEntryDao.save(getTempLogEntries());
//		tempLogDao.save(getTempLogs());
	}
	
	private List<TempLog> getTempLogs() {
		List<TempLog> tempLogs = new ArrayList<>();
		Date date = new Date();
		
		tempLogs.add(new TempLog(1,"c",105.2,new Date()));
		
		return tempLogs;
	}
}
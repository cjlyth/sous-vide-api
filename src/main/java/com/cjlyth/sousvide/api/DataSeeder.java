package com.cjlyth.sousvide.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cjlyth.sousvide.api.dao.ConfigurationDao;
import com.cjlyth.sousvide.api.entity.Configuration;

@Component
public class DataSeeder implements CommandLineRunner{

	private ConfigurationDao configurationDao;
	
	@Autowired
	public DataSeeder(ConfigurationDao configurationDao) {
		this.configurationDao = configurationDao;
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Configuration> configurations = new ArrayList<>();

		configurations.add(new Configuration("1",135.0, "c", new Date(), 90));
		configurations.add(new Configuration("2",134.6, "c", new Date(), 90));
		configurations.add(new Configuration("3",133.9, "c", new Date(), 90));
		
		configurationDao.save(configurations);
		
	}

}

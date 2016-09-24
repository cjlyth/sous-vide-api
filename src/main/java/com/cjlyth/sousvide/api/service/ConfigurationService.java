package com.cjlyth.sousvide.api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjlyth.sousvide.api.dao.ConfigurationDao;
import com.cjlyth.sousvide.api.entity.Configuration;

@Service
public class ConfigurationService {

	@Autowired
	private ConfigurationDao configurationDao;
	
	public void saveConfiguration(Configuration configuration) {
		configurationDao.save(configuration);
	}

	public Collection<Configuration> findAllByDeviceId(String deviceId) {
		return configurationDao.findAllByDeviceId(deviceId);
	}

    public Collection<Configuration> findAll() {
		return configurationDao.findAll();
		//return Arrays.asList(new Configuration("1", 135.0, "c", new Date(), 90));
	}
}

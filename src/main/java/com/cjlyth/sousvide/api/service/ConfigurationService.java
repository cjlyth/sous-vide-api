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
	
	public Configuration saveConfiguration(Configuration configuration) {
		return configurationDao.save(configuration);
	}

	public Configuration getConfiguration(String id) {
		return configurationDao.findOne(id);
	}

    public void deleteConfiguration(String configId) {
		configurationDao.delete(configId);
    }
}

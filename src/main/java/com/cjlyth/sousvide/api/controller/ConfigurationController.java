package com.cjlyth.sousvide.api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjlyth.sousvide.api.entity.Configuration;
import com.cjlyth.sousvide.api.service.ConfigurationService;

@RestController
@RequestMapping(value = "/configuration")
public class ConfigurationController {
	private static String configId = "1";
	@Autowired
	private ConfigurationService configurationService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Configuration saveConfiguration(@RequestBody Configuration configuration) {
		configuration.setDeviceId(configId);
		configuration.setRunning(true);
		return configurationService.saveConfiguration(configuration);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteConfiguration() {
		configurationService.deleteConfiguration(configId);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Configuration getConfiguration() {
        Configuration config = configurationService.getConfiguration(configId);
        if (null == config) {
            config = new Configuration();
            config.setDeviceId(configId);
        }
		return config;
	}
}

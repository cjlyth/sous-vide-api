package com.cjlyth.sousvide.api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjlyth.sousvide.api.entity.Configuration;
import com.cjlyth.sousvide.api.service.ConfigurationService;

@RestController
@RequestMapping(value = "/configuration")
public class ConfigurationController {
	
	@Autowired
	private ConfigurationService configurationService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveConfiguration(Configuration configuration) {
		configurationService.saveConfiguration(configuration);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Configuration> findAll() {
		return configurationService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{deviceId}")
	public Collection<Configuration> findAllByDeviceId(@PathVariable String deviceId) {
		return configurationService.findAllByDeviceId(deviceId);
	}
}

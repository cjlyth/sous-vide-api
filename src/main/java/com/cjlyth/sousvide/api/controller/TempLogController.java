package com.cjlyth.sousvide.api.controller;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjlyth.sousvide.api.entity.TempLog;
import com.cjlyth.sousvide.api.service.TempLogService;

@RestController
@RequestMapping(value = "tempLog")
public class TempLogController {

	@Autowired
	TempLogService tempLogService;

	@RequestMapping(method = RequestMethod.POST)
	public void saveTempLog(@RequestBody TempLog tempLog) {
		tempLogService.save(tempLog);;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<TempLog> findAll() {
		return tempLogService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public Collection<TempLog> findAllById(@PathVariable("id") Integer id) {
		return tempLogService.findAllById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/{fromTime}/{toTime}")
	public Collection<TempLog> findAllByFromTimeAfterAndToTimeBefore(@PathVariable("fromTime") Date fromTime, @PathVariable("toTime") Date toTime) {
		return tempLogService.findAllByTimeBetween(fromTime, toTime);
	}
}

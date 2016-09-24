package com.cjlyth.sousvide.api.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjlyth.sousvide.api.entity.LogEntry;
import com.cjlyth.sousvide.api.service.TempLogService;

@RestController
@RequestMapping(value = "logs")
public class LogsController {
	private Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	TempLogService tempLogService;

	@RequestMapping(method = RequestMethod.POST)
	public LogEntry saveTempLog(@RequestBody LogEntry logEntry) {
		tempLogService.save(logEntry);
		return logEntry;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Collection<LogEntry>> getLogs() {
		Map<String, Collection<LogEntry>> retVal = new HashMap<>();
		retVal.put("logs", tempLogService.findAll());
		return retVal;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{fromTime}/{toTime}")
	public Map<String, Collection<LogEntry>> findAllByFromTimeAfterAndToTimeBefore(@PathVariable("fromTime") Date fromTime, @PathVariable("toTime") Date toTime) {
		Map<String, Collection<LogEntry>> retVal = new HashMap<>();
		retVal.put("logs", tempLogService.findAllByTimeBetween(fromTime, toTime));
		return retVal;
	}
}

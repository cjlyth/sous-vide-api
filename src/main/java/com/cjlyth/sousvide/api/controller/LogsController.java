package com.cjlyth.sousvide.api.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjlyth.sousvide.api.entity.LogEntry;
import com.cjlyth.sousvide.api.service.LogEntryService;

@RestController
@RequestMapping(value = "logs")
public class LogsController {
	@Autowired
	LogEntryService logEntryService;

	@RequestMapping(method = RequestMethod.POST)
	public LogEntry saveTempLog(@RequestBody LogEntry logEntry) {
		logEntryService.save(logEntry);
		return logEntry;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Collection<LogEntry>> getLogs() {
		Map<String, Collection<LogEntry>> retVal = new HashMap<>();
		retVal.put("logs", logEntryService.findAll());
		return retVal;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{fromTime}")
	public Map<String, Collection<LogEntry>> findAllByFromTimeAfterAndToTimeBefore(@PathVariable("fromTime") Long fromTime) {
		Map<String, Collection<LogEntry>> retVal = new HashMap<>();
		retVal.put("logs", logEntryService.findAllByTimeBetween(fromTime, Math.max(System.currentTimeMillis(), fromTime)));
		return retVal;
	}
}

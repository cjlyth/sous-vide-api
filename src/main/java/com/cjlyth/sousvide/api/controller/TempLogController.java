package com.cjlyth.sousvide.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjlyth.sousvide.api.entity.TempLog;
import com.cjlyth.sousvide.api.service.TempLogService;

@RestController
@RequestMapping(value = "/tempLog")
public class TempLogController {
	
	@Autowired
	private TempLogService tempLogService;
	
	public void saveTempLog(@RequestBody TempLog tempLog) {
		tempLog.sa
	}
}

package com.cjlyth.sousvide.api.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cjlyth.sousvide.api.dao.LogEntryDao;
import com.cjlyth.sousvide.api.entity.LogEntry;

@Service
public class TempLogService {
	
	@Autowired
	private LogEntryDao logEntryDao;

	public Collection<LogEntry> findAll(){
		return logEntryDao.findAll();
	}
	
	public void save(LogEntry logEntry) {
		logEntryDao.save(logEntry);
	}

	
	public Collection<LogEntry> findAllByTimeBetween(@Param("fromTime") Date fromTime, @Param("toTime") Date toTime){
		return logEntryDao.findAllByTimestampBetween(fromTime, toTime);
	}

}

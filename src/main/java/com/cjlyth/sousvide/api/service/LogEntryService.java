package com.cjlyth.sousvide.api.service;

import java.util.Collection;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cjlyth.sousvide.api.dao.LogEntryDao;
import com.cjlyth.sousvide.api.entity.LogEntry;

@Service
public class LogEntryService {
	private Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	private LogEntryDao logEntryDao;

	public Collection<LogEntry> findAll(){
		return logEntryDao.findAll();
	}
	
	public void save(LogEntry logEntry) {
		logEntry.setTimestamp(System.currentTimeMillis());
		log.debug(ToStringBuilder.reflectionToString(ToStringStyle.MULTI_LINE_STYLE));
		logEntryDao.save(logEntry);
	}

	
	public Collection<LogEntry> findAllByTimeBetween(@Param("fromTime") Long fromTime, @Param("toTime") Long toTime){
		return logEntryDao.findAllByTimestampBetween(fromTime, toTime);
	}

}

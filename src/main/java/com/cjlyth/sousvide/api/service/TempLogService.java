package com.cjlyth.sousvide.api.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjlyth.sousvide.api.dao.TempLogDao;
import com.cjlyth.sousvide.api.entity.TempLog;
import com.cjlyth.sousvide.api.entity.TempLogEntry;

@Service
public class TempLogService {

	private TempLogDao tempLogDao;

	@Autowired
	public TempLogService(TempLogDao tempLogDao) {
		this.tempLogDao = tempLogDao;
	}
	
	public Collection<TempLog> findAll(){
		return tempLogDao.findAll();
	}
	
	/*@Id private String id;
	private Integer cookDuration;
	private Date fromTime;
	private Date toTime;

	@OneToMany(targetEntity=TempLogEntry.class, fetch= FetchType.EAGER)
	private List<TempLogEntry> tempLogEntries;*/
	
}

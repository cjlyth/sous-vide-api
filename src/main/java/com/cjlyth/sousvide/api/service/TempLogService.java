package com.cjlyth.sousvide.api.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cjlyth.sousvide.api.dao.TempLogDao;
import com.cjlyth.sousvide.api.entity.TempLog;

@Service
public class TempLogService {
	
	@Autowired
	private TempLogDao tempLogDao;

	public Collection<TempLog> findAll(){
		return tempLogDao.findAll();
	}
	
	public void save(TempLog tempLog) {
		tempLogDao.save(tempLog);
	}
	
	public Collection<TempLog> findAllById(@Param("id") Integer id) {
		return tempLogDao.findAllById(id);
	}
	
	public Collection<TempLog> findAllByTimeBetween(@Param("fromTime") Date fromTime, @Param("toTime") Date toTime){
		return tempLogDao.findAllByTimeBetween(fromTime, toTime);
	}

}

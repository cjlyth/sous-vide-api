package com.cjlyth.sousvide.api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
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
	
}

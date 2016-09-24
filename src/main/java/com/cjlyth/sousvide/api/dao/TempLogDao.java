package com.cjlyth.sousvide.api.dao;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjlyth.sousvide.api.entity.TempLog;

@Repository
public interface TempLogDao extends JpaRepository<TempLog, Integer>{

	public Collection<TempLog> findAllById(@Param("id") Integer id);
	
	public Collection<TempLog> findAllByTimeBetween(@Param("fromTime") Date fromTime, @Param("toTime") Date toTime);

}
package com.cjlyth.sousvide.api.dao;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjlyth.sousvide.api.entity.LogEntry;

@Repository
public interface LogEntryDao extends JpaRepository<LogEntry, Long>{
	Collection<LogEntry> findAllByTimestampBetween(@Param("fromTime") Long fromTime, @Param("toTime") Long toTime);

}
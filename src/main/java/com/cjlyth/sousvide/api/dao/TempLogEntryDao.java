package com.cjlyth.sousvide.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjlyth.sousvide.api.entity.TempLogEntry;

@Repository
public interface TempLogEntryDao extends JpaRepository<TempLogEntry, Integer> {

}

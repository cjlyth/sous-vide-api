package com.cjlyth.sousvide.api.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjlyth.sousvide.api.entity.Configuration;

@Repository
public interface ConfigurationDao extends JpaRepository<Configuration, String> {

	public Collection<Configuration> findAllByDeviceId(@Param("deviceId") String deviceId);
}

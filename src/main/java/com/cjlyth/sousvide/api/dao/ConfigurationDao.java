package com.cjlyth.sousvide.api.dao;

import com.cjlyth.sousvide.api.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationDao extends JpaRepository<Configuration, String> {

}

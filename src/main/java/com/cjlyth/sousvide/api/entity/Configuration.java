package com.cjlyth.sousvide.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Configuration {
	@Id private String deviceId;
	private Double temperature;
	private boolean running;
	private Date startTime;
	private Integer duration;
	

	public Configuration() {
		super();
	}

	public Configuration(String deviceId, double temperature, String scale, Date startTime, int duration) {
		this.deviceId = deviceId;
		this.temperature = temperature;
		this.startTime = startTime;
		this.duration = duration;
	}
	
	@JsonProperty("id")
	public String getDeviceId() {
		return deviceId;
	}

	@JsonProperty("id")
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	@JsonProperty("start_time")
	public Date getStartTime() {
		return startTime;
	}
	@JsonProperty("start_time")
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
}

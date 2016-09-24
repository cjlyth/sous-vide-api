package com.cjlyth.sousvide.api.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class TempLog {

	private Integer cookDuration;
	private Date fromTime;
	private Date toTime;
	private List<TempLogEntry> tempLog;

	public TempLog(Integer cookDuration, Date fromTime, Date toTime, List<TempLogEntry> tempLog) {
		super();
		this.cookDuration = cookDuration;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.tempLog = tempLog;
	}

	public TempLog() {
		super();
	}

	/**
	 * @return the cookDuration
	 */
	public Integer getCookDuration() {
		return cookDuration;
	}

	/**
	 * @param cookDuration the cookDuration to set
	 */
	public void setCookDuration(Integer cookDuration) {
		this.cookDuration = cookDuration;
	}

	/**
	 * @return the fromTime
	 */
	public Date getFromTime() {
		return fromTime;
	}

	/**
	 * @param fromTime the fromTime to set
	 */
	public void setFromTime(Date fromTime) {
		this.fromTime = fromTime;
	}

	/**
	 * @return the toTime
	 */
	public Date getToTime() {
		return toTime;
	}

	/**
	 * @param toTime the toTime to set
	 */
	public void setToTime(Date toTime) {
		this.toTime = toTime;
	}

	/**
	 * @return the tempLog
	 */
	public List<TempLogEntry> getTempLog() {
		return tempLog;
	}

	/**
	 * @param tempLog the tempLog to set
	 */
	public void setTempLog(List<TempLogEntry> tempLog) {
		this.tempLog = tempLog;
	}

}

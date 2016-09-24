package com.cjlyth.sousvide.api.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TempLog {
	@GeneratedValue(strategy= GenerationType.TABLE)
	@Id private Integer id;
	private Integer cookDuration;
	private Date fromTime;
	private Date toTime;

	@OneToMany(targetEntity=TempLogEntry.class, fetch= FetchType.EAGER)
	private List<TempLogEntry> tempLogEntries;

	public TempLog(Integer cookDuration, Date fromTime, Date toTime, List<TempLogEntry> tempLogEntries) {
		super();
		this.cookDuration = cookDuration;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.tempLogEntries = tempLogEntries;
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

	public List<TempLogEntry> getTempLogEntries() {
		return tempLogEntries;
	}

	public void setTempLogEntries(List<TempLogEntry> tempLogEntries) {
		this.tempLogEntries = tempLogEntries;
	}
}

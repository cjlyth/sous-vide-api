package com.cjlyth.sousvide.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TempLogEntry {
	@Id
	private String id;

	private Double tempValue;
	private String tempScale;
	private Integer timeStamp;
	
	public TempLogEntry(Double tempValue, String tempScale, Integer timeStamp) {
		super();
		this.tempValue = tempValue;
		this.tempScale = tempScale;
		this.timeStamp = timeStamp;
	}
	
	public TempLogEntry() {
		super();
	}
	
	/**
	 * @return the tempValue
	 */
	public Double getTempValue() {
		return tempValue;
	}
	/**
	 * @param tempValue the tempValue to set
	 */
	public void setTempValue(Double tempValue) {
		this.tempValue = tempValue;
	}
	/**
	 * @return the tempScale
	 */
	public String getTempScale() {
		return tempScale;
	}
	/**
	 * @param tempScale the tempScale to set
	 */
	public void setTempScale(String tempScale) {
		this.tempScale = tempScale;
	}
	/**
	 * @return the timeStamp
	 */
	public Integer getTimeStamp() {
		return timeStamp;
	}
	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(Integer timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}

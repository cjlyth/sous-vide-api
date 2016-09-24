package com.cjlyth.sousvide.api.entity;

import java.util.Date;

public class Configuration {
	private String deviceId;
	private Double tempValue;
	private String tempScale;
	private Date timeStamp;
	private Integer cookDuration;
	
	public Configuration(String deviceId, Double tempValue, String tempScale, Date timeStamp, Integer cookDuration) {
		super();
		this.deviceId = deviceId;
		this.tempValue = tempValue;
		this.tempScale = tempScale;
		this.timeStamp = timeStamp;
		this.cookDuration = cookDuration;
	}

	public Configuration() {
		super();
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
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

}

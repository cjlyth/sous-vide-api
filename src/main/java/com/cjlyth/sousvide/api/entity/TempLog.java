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
	
	@Id 
	private Integer id;
	private Integer cookDuration;
	private String tempScale;
	private double tempValue;
	private Date time;
	
	public TempLog(Integer cookDuration, String tempScale, double tempValue, Date time) {
		//this.id = id;
		this.cookDuration = cookDuration;
		this.tempScale = tempScale;
		this.tempValue = tempValue;
		this.time = time;
	}
	public TempLog() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCookDuration() {
		return cookDuration;
	}
	public void setCookDuration(Integer cookDuration) {
		this.cookDuration = cookDuration;
	}
	public String getTempScale() {
		return tempScale;
	}
	public void setTempScale(String tempScale) {
		this.tempScale = tempScale;
	}
	public double getTempValue() {
		return tempValue;
	}
	public void setTempValue(double tempValue) {
		this.tempValue = tempValue;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}


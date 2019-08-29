package com.gc.Lab28.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherResult {

	private String operationalMode;
//	private String srsName;
//	private String creationDate;
//	private String creationDateLocal;
//	private String productionCenter;
//	private ArrayList<weather> location;

	public WeatherResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOperationalMode() {
		return operationalMode;
	}
	public void setOperationalMode(String operationalMode) {
		this.operationalMode = operationalMode;
	}
//	public String getSrsName() {
//		return srsName;
//	}
//	public void setSrsName(String srsName) {
//		this.srsName = srsName;
//	}
//	public String getCreationDate() {
//		return creationDate;
//	}
//	public void setCreationDate(String creationDate) {
//		this.creationDate = creationDate;
//	}
//	public String getCreationDateLocal() {
//		return creationDateLocal;
//	}
//	public void setCreationDateLocal(String creationDateLocal) {
//		this.creationDateLocal = creationDateLocal;
//	}
//	public String getProductionCenter() {
//		return productionCenter;
//	}
//	public void setProductionCenter(String productionCenter) {
//		this.productionCenter = productionCenter;
//	}
//	
//	public ArrayList<weather> getLocation() {
//		return location;
//	}
//	public void setLocation(ArrayList<weather> location) {
//		this.location = location;
//	}
//	@Override
//	public String toString() {
//		return "WeatherResult [operationalMode=" + operationalMode + ", srsName=" + srsName + ", creationDate="
//				+ creationDate + ", creationDateLocal=" + creationDateLocal + ", productionCenter=" + productionCenter
//				+ ", location=" + location + "]";
//	}
	@Override
	public String toString() {
		return "WeatherResult [operationalMode=" + operationalMode + "]";
	}
	
	
}

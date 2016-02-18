package com.jits.core;

import java.io.Serializable;

public class ConfirmationBean implements IConfirmation,Serializable {


	@Override
	public String toString() {
		return "ConfirmationBean [getOrigin=" + getOrigin + ", getDest=" + getDest + ", getPackageType="
				+ getPackageType + ", getDeliveryType=" + getDeliveryType + ", getWeight=" + getWeight + ", isInsured="
				+ isInsured + ", getDeliveryTime=" + getDeliveryTime + ", getCost=" + getCost + ", getStatus="
				+ getStatus + "]";
	}
	private Address getOrigin;
	private Address getDest;
	private String getPackageType;
	private String getDeliveryType;
	private double getWeight;
	private boolean isInsured;
	private double getDeliveryTime;
	private double getCost;
	private String getStatus; 
	
	public ConfirmationBean() {
		// TODO Auto-generated constructor stub
	}
	
	public ConfirmationBean(String getStatus, Address getOrigin, Address getDest, String getPackageType, String getDeliveryType,
			double getWeight, boolean isInsured, double getDeliveryTime, double getCost) {
		super();
		this.getStatus = getStatus;
		this.getOrigin = getOrigin;
		this.getDest = getDest;
		this.getPackageType = getPackageType;
		this.getDeliveryType = getDeliveryType;
		this.getWeight = getWeight;
		this.isInsured = isInsured;
		this.getDeliveryTime = getDeliveryTime;
		this.getCost = getCost;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  
	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return getStatus;
	}

	@Override
	public Address getOrigin() {
		// TODO Auto-generated method stub
		return getOrigin;
	}

	@Override
	public Address getDest() {
		// TODO Auto-generated method stub
		return getDest;
	}

	@Override
	public String getPackageType() {
		// TODO Auto-generated method stub
		return getPackageType;
	}

	@Override
	public String getDeliveryType() {
		// TODO Auto-generated method stub
		return getDeliveryType;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return getWeight;
	}

	@Override
	public boolean isInsured() {
		// TODO Auto-generated method stub
		return isInsured;
	}

	@Override
	public double getDeliveryTime() {
		// TODO Auto-generated method stub
		return getDeliveryTime;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return getCost;
	}

	public void setGetOrigin(Address getOrigin) {
		this.getOrigin = getOrigin;
	}

	public void setGetDest(Address getDest) {
		this.getDest = getDest;
	}

	public void setGetPackageType(String getPackageType) {
		this.getPackageType = getPackageType;
	}

	public void setGetDeliveryType(String getDeliveryType) {
		this.getDeliveryType = getDeliveryType;
	}

	public void setGetWeight(double getWeight) {
		this.getWeight = getWeight;
	}

	public void setInsured(boolean isInsured) {
		this.isInsured = isInsured;
	}

	public void setGetDeliveryTime(double getDeliveryTime) {
		this.getDeliveryTime = getDeliveryTime;
	}

	public void setGetCost(double getCost) {
		this.getCost = getCost;
	}

	public void setGetStatus(String getStatus) {
		this.getStatus = getStatus;
	}

}

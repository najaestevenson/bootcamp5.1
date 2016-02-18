package com.jits.core;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

abstract class Delivery {
	private Parcel parcel;
	private Weighable weigh;
	private CostCalculator costCal;
	private double cost;

	abstract public int zoneDiff();

	abstract public double shipCost();

	abstract public double calculateDeliveryTime();

	Delivery(Parcel parcel) {
		super();
		this.parcel = parcel;
	}

	public double getCost() {
		return cost;
	}

	public void setActualCost(double cost) {
		this.cost = cost;
	}

	public CostCalculator getCostCal() {
		return costCal;
	}

	public void setCostCal(CostCalculator costCal) {
		this.costCal = costCal;
	}

	public abstract String parcelDialogue();

	public String reportParcelInfo() {
		String report = "Delivery Type:\t" + this.getClass().getSimpleName() + "\n" + "Parcel Type:\t"
				+ parcel.getClass().getSimpleName() + "\n" + "Weight:\t" + parcel.getWeight() + "lbs" + "\n" + "ETA:\t"
				+ this.calculateDeliveryTime() + " " + "days" + "\n" + "Origin:\t" + this.parcel.getOrigin().toString()
				+ "\n" + "Destination:\t" + this.parcel.getDestination().toString() + "\n" + "Shipping Cost:\t$"
				+ this.getCost() + "\n";

		return report;
	}

	public Parcel getParcel() {
		return parcel;
	}

	public void setParcel(Parcel parcel) {
		this.parcel = parcel;
	}

	public int getFirstFromZip() {
		String from = getParcel().getOrigin().getZip();
		int fromZip = Character.getNumericValue(from.charAt(0));

		return fromZip;
	}

	public int getFirstToZip() {
		String to = getParcel().getDestination().getZip();
		int toZip = Character.getNumericValue(to.charAt(0));

		return toZip;
	}

	public ConfirmationBean GenConfBean() {
		ConfirmationBean confBean = new ConfirmationBean();
		confBean.setGetDeliveryType(this.getClass().getSimpleName());
		confBean.setGetCost(this.getCost());
		confBean.setGetDeliveryTime(this.calculateDeliveryTime());
		confBean.setGetDest(this.getParcel().getDestination());
		confBean.setGetOrigin(this.getParcel().getOrigin());
		confBean.setGetPackageType(this.getParcel().getClass().getSimpleName());
		confBean.setGetStatus(this.parcelDialogue());
		confBean.setGetWeight(this.getParcel().getWeight());
		// confBean.setInsured(false);
		// TODO Auto-generated method stub

		this.createXMLfile(confBean);
		return confBean;

	}

	public void createXMLfile(ConfirmationBean confBean) {

		XMLEncoder e = null;
		try {
			e = new XMLEncoder((new FileOutputStream("Delivery Confirmation.xml")));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if(e != null){
				e.writeObject(confBean);
			e.close();
			}
		}
	}
}

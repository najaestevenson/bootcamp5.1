package com.jits.core;

import com.thirdParty.calibration.MailScale;

class Parcel {
	private Address origin;
	private Address destination;
	private long ID;
	private double weight=1.0;
	private double volume =1.0;
	int height;
	int width;
	int depth;
	
	
	


	@Override
	public String toString() {
		return "Parcel [origin=" + origin + ", destination=" + destination + ", ID=" + ID + "]";
	}
	
	double weighParcel(){
		
		return ((Weighable) new ScaleAdapter()).weigh(this);
	}
	
	public Parcel(long Id,Address origin, Address destination) {

		this.setOrigin(origin);
		this.setDestination(destination);
		this.setID(ID);
		this.setWeight(this.weighParcel()/16);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public double getVolume() {
		return volume;
	}
	
	public void setVolume(double volume) {
		this.volume = this.depth*this.height*this.width;
	}
	public Address getOrigin() {
		return origin;
	}

	public void setOrigin(Address origin) {
		this.origin = origin;
	}

	public Address getDestination() {
		return destination;
	}

	public void setDestination(Address destination) {
		this.destination = destination;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

//	public void determineParcelType(String x) {
//		String b = "Box";
//		String l = "Letter";
//
//		if (x.contains(b)) {
//			Parcel p = new Box(destination, destination, ID, 0, 0, 0);
//			
//		} else if (x.contains(l)) {
//			Parcel p = new Letter(ID, l, destination, destination);
//		}
//	}

	public double getWeight() {
		return weight=2;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setID(long iD) {
		ID = iD;
	}


}

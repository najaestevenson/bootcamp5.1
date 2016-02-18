package com.jits.core;

public class Box extends Parcel {
	

	public Box(Address origin, Address destination, long ID, int i, int j, int k) {
		super(ID, destination, origin);
		this.setDepth(i);
		this.setHeight(j);
		this.setWidth(k);
	}

	

	@Override
	public String toString() {
		return super.toString() + "Parcel Type: Box Dimensions:\t\n" + "Height:\t" + this.getHeight() + "\n"
				+ " Width:\t" + this.getWidth() + "\n" + "Depth:\t" + this.getDepth() + "\n";

	}
}

package com.jits.core;

class GroundCost implements CostCalculator {
private	int fromZip;
private	double weight;
private	int toZip;
private	int zoneDiff;

	GroundCost(int zoneDiff, int toZip, int fromZip, double weight) {
		this.zoneDiff = zoneDiff;
		this.toZip = toZip;
		this.fromZip = fromZip;
		this.weight = weight;
	}

	public int getToZip() {
		return toZip;
	}

	public void setToZip(int toZip) {
		this.toZip = toZip;
	}

	public int getFromZip() {
		return fromZip;
	}

	public void setFromZip(int fromZip) {
		this.fromZip = fromZip;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}



	public int getFirstFromZip() {
		//int fromZip = Character.getNumericValue((Integer.toString(getFirstFromZip()).charAt(0)));

		return fromZip;
	}

	public int getFirstToZip() {
		//int toZip = Character.getNumericValue((Integer.toString(getFirstFromZip()).charAt(0)));

		return toZip;
	}

	@Override
	public double shipCost() {

		double newCost = 0;
		double 	cost=0;
		double discount = 0;

		if (fromZip >= 8 | toZip >= 8) {
			if (fromZip == toZip) {
				discount = .05;
			}
		} else {
			discount = .05;
		}
		cost=zoneDiff * (weight*.0625) * 1.1;
		newCost = cost - (cost * discount);
		return newCost;
	}

	// public double calculateDiscount() {
	//
	// return cost;
	// }
}

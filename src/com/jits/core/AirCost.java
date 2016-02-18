package com.jits.core;

class AirCost implements CostCalculator {

	private int zoneDiff;
	private double weight;
	private double volume = 1;

	public AirCost(int zoneDiff, double weight) {
		this.zoneDiff= zoneDiff;
		this.weight= weight;
	}
	public int getZoneDiff() {
		return zoneDiff;
	}

	public void setZoneDiff(int zoneDiff) {
		this.zoneDiff = zoneDiff;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}



	public double shipCost() {
		double cost=0;
	
		if(volume==1){
			cost= Math.abs(getZoneDiff()*(weight*.0625)* volume*1.75);
		}else{
		
		cost= Math.abs(getZoneDiff() * (weight*.0625) * (volume/1728) * 1.75);
		}
		return cost;
	}

}

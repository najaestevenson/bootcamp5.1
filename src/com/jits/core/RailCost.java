package com.jits.core;

class RailCost implements CostCalculator {
private int zoneDiff;
	RailCost(int zoneDiff) {
	super();
	this.zoneDiff = zoneDiff;
}
	@Override
	public double shipCost() {
		if(zoneDiff==0){
			return 2.75;
		}else{
			return 5.00;
		}
		
	}

}

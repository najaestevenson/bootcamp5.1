package com.jits.core;

import java.util.NavigableMap;
import java.util.TreeMap;

import javax.swing.JOptionPane;

class Ground extends Delivery {

	Ground(Parcel parcel) {
		super(parcel);
	}

	@Override
	public String parcelDialogue() {
		int retVal = -1;
		String response;
		
		if (JOptionPane.showConfirmDialog(null, reportParcelInfo() + "\nWill you accept this delivery confirmation?\n",
				"WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			System.out.println("Parcel has been shipped!");
			retVal = 0;
			response ="Shipment Accepted";
		} else {
			System.out.println("Thank you. Your delivery has been cancelled.");
			retVal = 1;
			response ="Shipment Cancelled";
		}
		return response;
	}

	@Override
	public double calculateDeliveryTime() {
		return Math.abs(this.zoneDiff()) * 1.5;

	}

	@Override
	public int zoneDiff() {
		NavigableMap<Integer, Integer> timeZone = new TreeMap<Integer, Integer>();
		timeZone.put(0, 1);
		timeZone.put(3, 2);
		timeZone.put(6, 3);
		timeZone.put(8, 4);

		int answer = timeZone.get(timeZone.floorKey(super.getFirstFromZip()))
				- timeZone.get(timeZone.floorKey(super.getFirstToZip()));
		if (answer == 0) {
			answer = 1;

		} else {

			answer = Math.abs(answer);
		}
		return answer;
	}

	@Override
	public double shipCost() {
		
		super.setActualCost(this.getCostCal().shipCost());
		 System.out.println("hello im in ground");

		return Math.abs(this.getCost());
		

	}

}

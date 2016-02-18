package com.jits.core;

import java.util.NavigableMap;
import java.util.TreeMap;

import javax.swing.JOptionPane;

class Rail extends Delivery {

	Rail(Parcel parcel) {
		super(parcel);
		
	}

	@Override
	public String parcelDialogue() {
		int retVal = -1;
		String response;
		if (JOptionPane.showConfirmDialog(null, reportParcelInfo() + "\nWill you accept this delivery confirmation?\n",
				"WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

			JOptionPane.showMessageDialog(null, "Parcel has shipped!", "", JOptionPane.PLAIN_MESSAGE);
			retVal = 0;
			response="Shipment Accepted";
		} else {
			JOptionPane.showMessageDialog(null, "Thank you. Your Delivery has been cancelled.", "",
					JOptionPane.PLAIN_MESSAGE);
			retVal = 1;
			response= "Shipment Cancelled";
		}
		return response;
		
	}

	@Override
	public int zoneDiff() {
		NavigableMap<Integer, Integer> timeZone = new TreeMap<Integer, Integer>();
		timeZone.put(0, 1);
		timeZone.put(5, 2);
		

		int answer = timeZone.get(timeZone.floorKey(super.getFirstFromZip()))
				- timeZone.get(timeZone.floorKey(super.getFirstToZip()));
		
		return Math.abs(answer);
	
	}

	@Override
	public double shipCost() {
		
		return super.getCostCal().shipCost();
	}

	@Override
	public double calculateDeliveryTime() {
		if(this.zoneDiff()==0){
			return 5;
		}else {
			return 10;
			
		}
		
	}

}

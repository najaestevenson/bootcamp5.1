package com.jits.core;

import javax.swing.JOptionPane;

class Air extends Delivery {

	Air(Parcel parcel) {
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
			 response = "Shipment Accepted";
		} else {
			JOptionPane.showMessageDialog(null, "Thank you. Your Delivery has been cancelled.", "",
					JOptionPane.PLAIN_MESSAGE);
			retVal = 1;
			response ="ShipmentCanceled";
		}
		return response;
	}

	@Override
	public int zoneDiff() {
		
		int answer = super.getFirstFromZip() - super.getFirstToZip();
		if (answer == 0) {
			return 1;
		}
		return Math.abs(answer);
	}
	@Override
	public double calculateDeliveryTime() {
		
		return Math.abs(this.zoneDiff()) * .25;
		
	}

	 public double shipCost() {
		 setActualCost(this.getCostCal().shipCost());
		return this.getCost(); 
	}
		


}

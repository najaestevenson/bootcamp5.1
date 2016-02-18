package com.jits.core;

import java.util.Map;

class DeliveryFactory {
	CostCalculator costCal;

	Delivery getDelivery(Map<String, String> deliveryMap) {
		Parcel parcel = null;
		Delivery del = null;

		String parcelType = deliveryMap.get("type").substring(0, 1);
		String deliveryType = deliveryMap.get("type").substring(1, 2);

		Address destination = new Address(deliveryMap.get("toName"), deliveryMap.get("toStreet"), deliveryMap.get("toCity"),
				deliveryMap.get("toState").toUpperCase(), deliveryMap.get("toZip"));

		Address origin = new Address(deliveryMap.get("fromName"), deliveryMap.get("fromStreet"),
				deliveryMap.get("fromCity"), deliveryMap.get("fromState").toUpperCase(), deliveryMap.get("fromZip"));

		if (parcelType.equalsIgnoreCase("L")) {
			parcel = new Letter(Long.parseLong(deliveryMap.get("id")), deliveryMap.get("lType"), origin, destination);
		} else if (parcelType.equalsIgnoreCase("B")) {
			parcel = new Box(origin, destination, Long.parseLong(deliveryMap.get("id")),
					Integer.parseInt(deliveryMap.get("height")), Integer.parseInt(deliveryMap.get("width")),
					Integer.parseInt(deliveryMap.get("depth")));
		}

		if (deliveryType.equalsIgnoreCase("G")) {
			del = new Ground(parcel);
			costCal= new GroundCost(del.zoneDiff(),del.getFirstFromZip(),del.getFirstToZip(),parcel.getWeight());
			del.setCostCal(costCal);
			del.setActualCost(costCal.shipCost());
			System.out.println(del.getCost());
		} else if (deliveryType.equalsIgnoreCase("A")) {
			del = new Air(parcel);
			costCal = new AirCost(del.zoneDiff(),del.getParcel().getWeight());
			del.setCostCal(costCal);
			del.setActualCost(costCal.shipCost());

		}else if(deliveryType.equalsIgnoreCase("R")){
			del= new Rail(parcel);
			costCal = new RailCost(del.zoneDiff());
			del.setCostCal(costCal);
			del.setActualCost(costCal.shipCost());
		}

		return del;
	}

}

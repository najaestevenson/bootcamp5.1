package com.jits.core;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class DialogueTest {
	Delivery letterGround;
	Map<String, String> letterGroundMap = new HashMap<String, String>();
	DeliveryFactory parse;
@Before
public void setUp(){
	

letterGroundMap.put("type", "LG");
letterGroundMap.put("id", "1");
letterGroundMap.put("toName", "Najae");
letterGroundMap.put("toStreet", "2174 Skype Isle Pass");
letterGroundMap.put("toCity", "Lawrenceville");
letterGroundMap.put("toState", "Ga");
letterGroundMap.put("toZip", "74532");
letterGroundMap.put("fromName", "Donald");
letterGroundMap.put("fromStreet", "4436 Round stone dr.");
letterGroundMap.put("fromCity", "Snellville");
letterGroundMap.put("fromState", "Ga");
letterGroundMap.put("fromZip", "30039");
letterGroundMap.put("lType", "FireProof");
parse = new DeliveryFactory();

letterGround = parse.getDelivery(letterGroundMap);
}
	@Test
	public void test() {
		assertEquals("Shipment Accepted",letterGround.parcelDialogue());
		
	}

}

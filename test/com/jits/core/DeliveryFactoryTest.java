package com.jits.core;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.jits.core.Delivery;
import com.jits.core.DeliveryFactory;

public class DeliveryFactoryTest {

	Delivery letterGround;
	Delivery letterAir;
	Delivery boxGround;
	Delivery boxAir;
	Delivery boxGroundtest;
	Delivery boxRail;
	DeliveryFactory par;
	Map<String, String> letterGroundMap = new HashMap<String, String>();
	Map<String, String> letterAirMap = new HashMap<String, String>();
	Map<String, String> boxGroundMap = new HashMap<String, String>();
	Map<String, String> boxAirMap = new HashMap<String, String>();
	Map<String, String> boxGroundtestMap = new HashMap<String, String>();
	Map<String, String> boxRailtestMap = new HashMap<String, String>();

	@Before
	public void testSetUP() {
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

		letterAirMap.put("type", "LA");
		letterAirMap.put("id", "1");
		letterAirMap.put("toName", "Najae");
		letterAirMap.put("toStreet", "2174 Skype Isle Pass");
		letterAirMap.put("toCity", "Lawrenceville");
		letterAirMap.put("toState", "Ga");
		letterAirMap.put("toZip", "30045");
		letterAirMap.put("fromName", "Donald");
		letterAirMap.put("fromStreet", "4436 Round stone dr.");
		letterAirMap.put("fromCity", "Snellville");
		letterAirMap.put("fromState", "Ga");
		letterAirMap.put("fromZip", "75354");
		letterAirMap.put("lType", "FireProof");

		boxGroundMap.put("type", "BG");
		boxGroundMap.put("id", "1");
		boxGroundMap.put("toName", "Najae");
		boxGroundMap.put("toStreet", "2174 Skype Isle Pass");
		boxGroundMap.put("toCity", "Lawrenceville");
		boxGroundMap.put("toState", "Ga");
		boxGroundMap.put("toZip", "30045");
		boxGroundMap.put("fromName", "Donald");
		boxGroundMap.put("fromStreet", "4436 Round stone dr.");
		boxGroundMap.put("fromCity", "Snellville");
		boxGroundMap.put("fromState", "Ga");
		boxGroundMap.put("fromZip", "30039");
		boxGroundMap.put("lType", "FireProof");
		boxGroundMap.put("height", "15");
		boxGroundMap.put("width", "16");
		boxGroundMap.put("depth", "17");

		boxAirMap.put("type", "BA");
		boxAirMap.put("id", "1");
		boxAirMap.put("toName", "Najae");
		boxAirMap.put("toStreet", "2174 Skype Isle Pass");
		boxAirMap.put("toCity", "Lawrenceville");
		boxAirMap.put("toState", "Ga");
		boxAirMap.put("toZip", "30045");
		boxAirMap.put("fromName", "Donald");
		boxAirMap.put("fromStreet", "4436 Round stone dr.");
		boxAirMap.put("fromCity", "Snellville");
		boxAirMap.put("fromState", "Ga");
		boxAirMap.put("fromZip", "30039");
		boxAirMap.put("lType", "FireProof");
		boxAirMap.put("height", "15");
		boxAirMap.put("width", "16");
		boxAirMap.put("depth", "17");

		boxGroundtestMap.put("type", "BG");
		boxGroundtestMap.put("id", "1");
		boxGroundtestMap.put("toName", "Najae");
		boxGroundtestMap.put("toStreet", "2174 Skype Isle Pass");
		boxGroundtestMap.put("toCity", "Lawrenceville");
		boxGroundtestMap.put("toState", "Ga");
		boxGroundtestMap.put("toZip", "76543");
		boxGroundtestMap.put("fromName", "Donald");
		boxGroundtestMap.put("fromStreet", "4436 Round stone dr.");
		boxGroundtestMap.put("fromCity", "Snellville");
		boxGroundtestMap.put("fromState", "Ga");
		boxGroundtestMap.put("fromZip", "98532");
		boxGroundtestMap.put("lType", "FireProof");
		boxGroundtestMap.put("height", "3");
		boxGroundtestMap.put("width", "5");
		boxGroundtestMap.put("depth", "8");

		boxRailtestMap.put("type", "BR");
		boxRailtestMap.put("id", "1");
		boxRailtestMap.put("toName", "Najae");
		boxRailtestMap.put("toStreet", "2174 Skype Isle Pass");
		boxRailtestMap.put("toCity", "Lawrenceville");
		boxRailtestMap.put("toState", "Ga");
		boxRailtestMap.put("toZip", "10343");
		boxRailtestMap.put("fromName", "Donald");
		boxRailtestMap.put("fromStreet", "4436 Round stone dr.");
		boxRailtestMap.put("fromCity", "Snellville");
		boxRailtestMap.put("fromState", "Ga");
		boxRailtestMap.put("fromZip", "58393");
		boxRailtestMap.put("lType", "FireProof");
		boxRailtestMap.put("height", "2");
		boxRailtestMap.put("width", "4");
		boxRailtestMap.put("depth", "5");
		
		par = new DeliveryFactory();

		letterGround = par.getDelivery(letterGroundMap);
		letterAir = par.getDelivery(letterAirMap);
		boxGround = par.getDelivery(boxGroundMap);
		boxAir = par.getDelivery(boxAirMap);
		boxGroundtest = par.getDelivery(boxGroundtestMap);
		boxRail= par.getDelivery(boxRailtestMap);
	}

	@Test
	public void newLetterGroundTest() {
		assertEquals("Ground", letterGround.getClass().getSimpleName());
		assertEquals("Letter", letterGround.getParcel().getClass().getSimpleName());
		assertEquals("Najae 2174 Skype Isle PassLawrenceville GA 74532",
				letterGround.getParcel().getOrigin().toString());
	}

	@Test
	public void newLetterAirTest() {
		assertEquals("Air", letterAir.getClass().getSimpleName());
		assertEquals("Letter", letterAir.getParcel().getClass().getSimpleName());
		assertEquals("Najae 2174 Skype Isle PassLawrenceville GA 30045", letterAir.getParcel().getOrigin().toString());

	}

	@Test
	public void newBoxGroundTest() {
		assertEquals("Ground", boxGround.getClass().getSimpleName());
		assertEquals("Box", boxGround.getParcel().getClass().getSimpleName());
		assertEquals("Najae 2174 Skype Isle PassLawrenceville GA 30045", boxGround.getParcel().getOrigin().toString());

	}

	@Test
	public void newBoxAirTest() {
		assertEquals("Air", boxAir.getClass().getSimpleName());
		assertEquals("Box", boxAir.getParcel().getClass().getSimpleName());
		assertEquals("Najae 2174 Skype Isle PassLawrenceville GA 30045", boxAir.getParcel().getOrigin().toString());
	}

	@Test
	public void AirDeliveryTime() {
		double actual = letterAir.calculateDeliveryTime();
		double expected = 1.0;
		assertEquals(expected, actual, .001);

	}

	@Test
	public void GroundDeliveryTime() {
		double actual = boxAir.calculateDeliveryTime();
		double expected = .25;
		assertEquals(expected, actual, .001);
	}

	@Test
	public void DefaultDeliveryTime() {
		double actual = letterGround.calculateDeliveryTime();
		double expected = 1.5;
		assertEquals(expected, actual, .001);
	}

	@Test
	public void LetterAirShippingCost() {
		
		double actual = letterAir.getCost();
	
		double expected = .875;
		assertEquals(expected, actual, .001);
		
	}

	@Test
	public void BoxGroundShippingCost() {
		double actual = boxGround.shipCost();
		double expected = .1306;
		assertEquals(expected, actual, .001);

	}

	@Test
	public void BoxGroundShipCost_no_discount() {
		double actual = boxGroundtest.shipCost();
		double expected = .1375;
		assertEquals(expected, actual, .001);

	}
	@Test
	public void BoxRailTest(){
		String expected = "GA";
		String actual = boxRail.getParcel().getOrigin().getState();
		assertEquals(expected, actual);
		
		String expected2 = "Najae";
		String actual2 = boxRail.getParcel().getOrigin().getFirstName();
		assertEquals(expected2, actual2);
		
		double expected3 = 5.00;
		double actual3 = boxRail.shipCost();
		assertEquals(expected3, actual3, .001);
	}
	@Test 
	public void BoxDialogueTest(){
		String expected ="Shipment Accepted";
		String actual= boxRail.parcelDialogue();
		assertEquals(expected, actual);
		
		String expected1 ="Shipment Accepted";
		String actual1= letterAir.parcelDialogue();
		assertEquals(expected1, actual1);
		
		String expected2 ="Shipment Accepted";
		String actual2= boxGround.parcelDialogue();
		
		assertEquals(expected2, actual2);
		
	}
	
	@Test
	public void testGenerateConfirmationBean(){
		String expected = "Letter";
		String actual= letterAir.GenConfBean().getPackageType();
		assertEquals(expected, actual);
		
		String expected1 = "Shipment Accepted";
		String actual1= boxAir.GenConfBean().getStatus();
		assertEquals(expected1, actual1);

		double expected2 = 2;
		double actual2 = boxAir.GenConfBean().getWeight();
		assertEquals(expected2, actual2, .001);
}
	@Test
	public void testXML(){
		letterAir.GenConfBean();
	}
}

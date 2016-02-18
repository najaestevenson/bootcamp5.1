package com.jits.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jits.core.Address;
import com.jits.core.Air;
import com.jits.core.Box;
import com.jits.core.Ground;
import com.jits.core.Letter;
import com.jits.core.Parcel;

public class DelieveryTest {
	private Parcel let;
    private	Parcel p;
	private Box b;
	private Address toAddress;
	private Address fromAddress;
	private Air air;
	private Ground g;

	@Before
	public void setUp() {
		// b= new Box(fromAddress, toAddress, 8,2,5, 0);
		fromAddress = new Address("Najae Stevenson", "2174 Skye Isle Pass", "Lawrenceville", "Ga", "30045");
		toAddress = new Address("Pamela J", "4436 Round Stone Drive", "Snellville", ",Ga", "30039");
		p = new Box(fromAddress, toAddress, 4, 0, 0, 0);
		let = new Letter(0, "WeatherProof", fromAddress, toAddress);
		air = new Air(p);
		g = new Ground(p);
	}

	@Test
	public void test() {
		
		String actual = air.reportParcelInfo();
		assertTrue(actual.contains("2174"));

	}

	@Test
	public void jOptionAirTest() {
		String expected = "Shipment Accepted";
		String actual = air.parcelDialogue();
		assertEquals(expected, actual);
	}

	@Test
	public void jOptPaneGroundTest() {
		String expected = "Shipment Accepted";
		String actual = g.parcelDialogue();
		assertEquals(expected, actual);
	}

	@Test
	public void letterTypeTest() {
		String expected = "WEATHERPROOF";
		String actual = (((Letter) let).getLetterType().toString());
		
		assertEquals(expected, actual);
	}
}

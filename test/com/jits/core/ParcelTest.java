package com.jits.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jits.core.Address;
import com.jits.core.Box;
import com.jits.core.Letter;
import com.jits.core.Parcel;

public class ParcelTest {
	Parcel p;
	Address to;
	Address from;
	Box box;
	Letter let;

	@Before
	public void setUp() {
		p = new Parcel(8, from, to);
		to = new Address("Najae Stevenson", "2174 skye Isles Pass", "Lawrenceville", "Ga", "30045");
		from = new Address("Matthew Simmons", "2930 Loving Knowledge Dr.", "Atlanta", "Ga", "30114");
		box = new Box(from, from, 8, 8, 12, 5);
		let = new Letter(8, "Weatherproof", to, from);

	}

	@Test
	public void parTest() {
		String expected = "Najae " + "Stevenson " + "2174 skye Isles Pass" + "Lawrenceville " + "Ga " + "30045";
		String actual = to.toString();
		
		assertEquals(expected, actual);

		String expected1 = "Matthew " + "Simmons " + "2930 Loving Knowledge Dr." + "Atlanta " + "Ga " + "30114";
		String actual1 = from.toString();
		assertEquals(expected1, actual1);

	}

	@Test
	public void idTest() {
		int expected = 8;
		int actual = box.getDepth();
		assertEquals(expected, actual);

		int expected1 = 12;
		int actual1 = box.getHeight();
		assertEquals(expected1, actual1);

		int expected2 = 5;
		int actual2 = box.getWidth();
		assertEquals(expected2, actual2);

	}
	
	@Test
	public void weighParcelTest() {
		assertEquals(true, (Double) box.weighParcel() instanceof Double);
		
	}

}
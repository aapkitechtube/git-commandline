package com.aapkitechtube.git;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumbersTest {

	@Test
	public void testAddNumbers() {
		AddNumbers addNumbers = new AddNumbers();
		int result = addNumbers.addNumbers(1, 3, 5);
		
		assertEquals(9, result);
	}
	
	@Test
	public void testAddNumbers1() {
		AddNumbers addNumbers = new AddNumbers();
		int result = addNumbers.addNumbers(1, 3, 5, 10);
		
		assertEquals(19, result);
	}

}

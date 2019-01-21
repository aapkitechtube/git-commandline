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

}

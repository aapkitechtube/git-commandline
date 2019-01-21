package com.aapkitechtube.git;

public class AddNumbers {
	
	public int addNumbers (int...numbers) {
		
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
}

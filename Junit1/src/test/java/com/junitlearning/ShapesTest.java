package com.junitlearning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	@Test
	void computeSquareArea() {
		Shapes shape = new Shapes();
		
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	@Test
	void computeCircleArea() {
		Shapes shape = new Shapes();
		
		assertEquals(12.56, shape.computeCircleArea(2), "Area calculation is wrong");
	}


}
	
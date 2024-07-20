package com.telusko.service;


import static org.junit.Assert.*;
import org.junit.Test;
import com.learning.dao.JavaCourse;
import com.telusko.service.*;
public class PurchaseCourseTest {

	@Test
	public void proceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JavaCourse());
		
		assertTrue(status);
		
	}

}

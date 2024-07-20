package com.telusko.service;

import com.learning.dao.*;


public class PurchaseCourse {

	public boolean proceedWithCourse(Course course)
	{
		return course.coursePurchased();
		}
}

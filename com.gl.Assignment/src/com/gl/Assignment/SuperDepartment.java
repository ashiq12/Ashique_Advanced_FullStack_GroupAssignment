package com.gl.Assignment;

public class SuperDepartment {
	String departmentName()
	{
		return "Super Department"; 
	}
	String getTodaysWork()
	{
		return "No Work as of now";
	}
	String getWorkDeadline() 
	{
		return "NIL";
	}
	String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}
	public void display()
		{
			System.out.println("Welcome to "+departmentName());
			System.out.println(""+getTodaysWork());
			
		}	
}

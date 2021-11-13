package com.gunda.app.git_demo;


public class App {
	public void addData(String data) {
		if (data.equals(Contstants.DATA_TYPE))
			System.out.println("data is correct");

	}
	public void methodAdded()
	{
		System.out.println("added by developer 2");
	}
	
	
	public void displayNames()
	{
		System.out.println("names displayed");
	}
	
	

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

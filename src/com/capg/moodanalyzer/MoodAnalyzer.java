package com.capg.moodanalyzer;

public class MoodAnalyzer {
	
	String inputMessage ;
	
	
	//default constructor
	public MoodAnalyzer() {
		
	}
	
	//Parameterized constructor
	public MoodAnalyzer(String inputMessage) {
		this.inputMessage = inputMessage;
	}
	
	public  String analyzeMood() {
		
		try {
			if(inputMessage.equalsIgnoreCase("I am in sad mood")) {
				System.out.println("SAD");
				return "SAD";
			}
			else {
				System.out.println("HAPPY");
				return "HAPPY";
			}
		} catch (Exception e) {
			System.out.println("Exception Handled");
			return "Exception Handled";
		}
	}
	
	public static void main(String[] args) {
		
		//Creating an object of Mood Analyzer
		MoodAnalyzer MoodAnalyzerObject = new MoodAnalyzer(); //calling parameterized constructor
		MoodAnalyzerObject.analyzeMood();
	}
}

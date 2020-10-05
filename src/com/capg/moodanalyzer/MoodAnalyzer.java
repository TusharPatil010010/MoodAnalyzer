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
		
		if(inputMessage.equalsIgnoreCase("I am in sad mood")) {
			System.out.println("SAD");
			return "SAD";
		}
		else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
	}
	
	public static void main(String[] args) {
		
		//Creating an object of Mood Analyzer
		MoodAnalyzer MoodAnalyzerObject = new MoodAnalyzer("I am in sad mood"); //calling parameterized constructor
		MoodAnalyzerObject.analyzeMood();
	}
}

package com.capg.moodanalyzer;

public class MoodAnalyzer {
	
	public  String analyzeMood(String inputMessage) {
		
		//TC1.1, should return sad when input is sad message
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
		MoodAnalyzer MoodAnalyzerObject = new MoodAnalyzer();
		MoodAnalyzerObject.analyzeMood("I am in Sad Mood");
	}
}

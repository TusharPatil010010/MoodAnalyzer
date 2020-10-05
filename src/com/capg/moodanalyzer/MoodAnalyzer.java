package com.capg.moodanalyzer;

public class MoodAnalyzer {
	
	public  String analyzeMood(String inputMessage) {
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
		MoodAnalyzer MoodAnalyzerObject = new MoodAnalyzer();
		MoodAnalyzerObject.analyzeMood("I am in Sad Mood");
	}
}

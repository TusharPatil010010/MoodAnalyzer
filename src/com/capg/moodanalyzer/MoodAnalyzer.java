package com.capg.moodanalyzer;

public class MoodAnalyzer {
	
	String inputMessage ;
	
	enum Input {
		NULL, Empty;
	}
	
	
	//default constructor
	public MoodAnalyzer() {
		
	}
	
	//Parameterized constructor
	public MoodAnalyzer(String inputMessage) {
		this.inputMessage = inputMessage;
	}
	
	public  String analyzeMood() throws MoodAnalysisException {
		
		try {
			if(inputMessage.equalsIgnoreCase("I am in sad mood")) {
				System.out.println("SAD");
				return "SAD";
			}
			
		} catch (NullPointerException npe) {
			throw new MoodAnalysisException("Invalid mood, Enter valid mood "+ Input.NULL);
		}
		
		if(inputMessage.equals("")) {
			throw new MoodAnalysisException("Empty mood, Enter valid mood "+ Input.Empty );
		}
		return "HAPPY";
	}
}

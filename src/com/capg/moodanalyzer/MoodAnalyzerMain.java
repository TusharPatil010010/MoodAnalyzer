package com.capg.moodanalyzer;

public class MoodAnalyzerMain {
	
	public static void main(String[] args)  {
			
			//Creating an object of Mood Analyzer
			try {
				MoodAnalyzer MoodAnalyzerObject = new MoodAnalyzer(); 
				MoodAnalyzerObject.analyzeMood();
			} catch (MoodAnalysisException e) {
				e.printStackTrace();
			}
	}
}

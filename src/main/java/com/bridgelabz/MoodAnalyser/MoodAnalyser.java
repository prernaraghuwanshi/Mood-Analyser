package com.bridgelabz.MoodAnalyser;

/**
 * Hello world!
 *
 */
public class MoodAnalyser 
{
	public String analyseMood(String mood)
	{
		if (mood.contains("sad"))
		{
			return "SAD";
		}
		return "HAPPY";
	}

}

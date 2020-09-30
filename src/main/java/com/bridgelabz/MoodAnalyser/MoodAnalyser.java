package com.bridgelabz.MoodAnalyser;

/**
 * Hello world!
 *
 */
public class MoodAnalyser 
{
	private String message;
	
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}
	public MoodAnalyser()
	{
		super();
	}

	public String analyseMood()
	{
		if (message.contains("sad"))
		{
			return "SAD";
		}
		return "HAPPY";
	}

}

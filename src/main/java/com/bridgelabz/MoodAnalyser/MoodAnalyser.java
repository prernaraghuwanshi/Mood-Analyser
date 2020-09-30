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

	public String analyseMood() throws MoodAnalyserException
	{
		try
		{
			if(message.length()==0)
			{
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"empty");
			}
			if (message.contains("sad"))
			{
				return "SAD";
			}
			return "HAPPY";
		}
		catch(NullPointerException e)
		{
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Enter Proper Message");
		}
	}

}

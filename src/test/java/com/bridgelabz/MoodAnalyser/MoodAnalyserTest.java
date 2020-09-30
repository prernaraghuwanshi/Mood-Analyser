package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class MoodAnalyserTest 
{
MoodAnalyser moodAnalyser = null;
	
	
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		moodAnalyser= new MoodAnalyser("I am in a sad mood");
		String mood= moodAnalyser.analyseMood();
		assertEquals("SAD",mood);
	}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy()
	{
		moodAnalyser= new MoodAnalyser("I am in a happy mood");
		String mood= moodAnalyser.analyseMood();
		assertEquals("HAPPY",mood);
	}
	@Test
	public void givenMessage_WhenAny_ShouldReturnHappy()
	{
		moodAnalyser= new MoodAnalyser("I am in any mood ");
		String mood= moodAnalyser.analyseMood();
		assertEquals("HAPPY",mood);
	}
	
}

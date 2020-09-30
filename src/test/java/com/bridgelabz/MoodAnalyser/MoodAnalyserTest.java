package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class MoodAnalyserTest 
{
MoodAnalyser moodAnalyser = null;
	
	@Before
	public void initialize()
	{
		 moodAnalyser= new MoodAnalyser();
	}
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		String mood= moodAnalyser.analyseMood("This a sad message");
		assertEquals("SAD",mood);
	}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy()
	{
		String mood= moodAnalyser.analyseMood("This a happy message");
		assertEquals("HAPPY",mood);
	}
	@Test
	public void givenMessage_WhenAny_ShouldReturnHappy()
	{
		String mood= moodAnalyser.analyseMood("I am in any mood ");
		assertEquals("HAPPY",mood);
	}
	
}

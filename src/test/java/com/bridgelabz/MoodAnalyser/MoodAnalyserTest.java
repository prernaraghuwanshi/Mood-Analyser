package com.bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class MoodAnalyserTest 
{
MoodAnalyser moodAnalyser = null;
	
	
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		moodAnalyser= new MoodAnalyser("I am in a sad mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			assertEquals("SAD",mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy()
	{
		moodAnalyser= new MoodAnalyser("I am in a happy mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			assertEquals("HAPPY",mood);
		} catch (MoodAnalyserException e) {
			
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenMessage_WhenAny_ShouldReturnHappy()
	{
		moodAnalyser= new MoodAnalyser("I am in any mood ");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			assertEquals("HAPPY",mood);
		} catch (MoodAnalyserException e) {
			
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenMessage_WhenNull_Exception()
	{
		moodAnalyser= new MoodAnalyser(null);
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
	@Test
	public void givenMessage_WhenEmpty_Exception()
	{
		moodAnalyser= new MoodAnalyser("");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
		
	}
	
}

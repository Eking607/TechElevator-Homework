package com.techelevator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

public class WordCountTest {
	
	@Test
	
	public void kjdsbb() {
	WordCount myWordCount = new WordCount();
	
	String[] wordStrings = {"ba", "ba", "black", "sheep"};
	Map<String, Integer> myMap = new HashMap<String, Integer>();
	myMap.put("ba", 2);
	myMap.put("black", 1);
	myMap.put("sheep", 1);
	
	Map<String, Integer> getCount = myWordCount.getCount(wordStrings);
			Assert.assertTrue(myMap.keySet().containsAll(getCount.keySet()));
	
	}
	
	

}
package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

Map<String,Integer> namesAgeMap = new HashMap<String,Integer>();

namesAgeMap.put("Dan", 3);
namesAgeMap.put("Micheal", 3);
namesAgeMap.put("Ethan", 4);


             			      		                			
for (Map.Entry<String, Integer> dontMatter : namesAgeMap.entrySet()) {			
	System.out.println(dontMatter.getKey() + " is "	+ dontMatter.getValue());				 
	}
	

	System.out.println("####################");
	System.out.println("        SETS");
	System.out.println("####################");
	System.out.println();
	
	Set<String> names = new HashSet<String>();
	
	names.add("Ethan");
	names.add("King");
	names.add("Gang");
	
	for (String name : names) {
		System.out.println(name);
	}
	
	int sizeOfSet = names.size();
	System.out.println(names.size());
	}


	
}

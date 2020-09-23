package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lecture {
	
	
	
	public static void main(String[] args) {
	
		
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> groupNames = new ArrayList<String>();   //// List
		groupNames.add("Jermiah");
		groupNames.add("Firdavs");
		groupNames.add("Shawn");
		groupNames.add ("Ethan");
	
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		int i = 0;              			      		//// Or we could get rid of this and add....
		for (i = 0; i < groupNames.size(); i++) { 		//// int i = 0;
		System.out.println(groupNames.get(i)); 			//// Lists ordered
			}
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		groupNames.add("Ethan");
		for (i = 0; i < groupNames.size(); i++) { 		
			System.out.println(groupNames.get(i)); 			
				}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		groupNames.add(1, "Chicken Little");
		
		for (i = 0; i < groupNames.size(); i++) { 		
			System.out.println(groupNames.get(i)); 			
				}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		groupNames.remove(1);
		
		System.out.println(groupNames);
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean hasEthan = groupNames.contains("Ethan");
		boolean hasJohn = groupNames.contains("John");
		boolean hasLowerCaseEthan = groupNames.contains("ethan");
			/*if (boolean.class != null) {
				System.out.println((groupNames.contains(hasLowerCaseEthan) && groupNames.contains("Ethan")); ////// wrong
			}*/

		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		
		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */

		
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for (i = 0; i < groupNames.size(); i++) { 		///// hard way.
			System.out.println(groupNames.get(i)); 			
				}
		System.out.println();
		System.out.println();
		
		for(String name : groupNames) {    /// easy
				System.out.println(name);
		}
		
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();

		Queue<String> priorities = new LinkedList<String>();
		
		priorities.offer("Clean");
		priorities.offer("Wash");
		priorities.offer("Sweep");
		
		while(priorities.size() > 0) {
			String myNextPriority = priorities.poll();
			System.out.println("Next Priority: " + myNextPriority);
		}
		
		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();
		
		Stack<String> browser = new Stack<String>();
		


		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////

		////////////////////
		// POPPING THE STACK
		////////////////////

	}
}

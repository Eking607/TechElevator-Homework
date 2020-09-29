package com.techelevator;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Application {


    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

    }

    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() { 
    	
    }


    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
    	
    	System.out.println("------------- DEPARTMENTS ------------------------------");
    		
    		
    	  List<String> department = new ArrayList<String>(Arrays.asList("Marketing", "Sales", "Engineering"));
    		
    	  	for(int i = 0; i < department.size(); i++) {
      			
    	  		System.out.println(department.get(i));
      			}
      	
   
       
     }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}

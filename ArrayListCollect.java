package com.day5.collection;

import java.util.ArrayList;

public class ArrayListCollect {
	 
	    public static void main(String[] args) {
	 
	    	ArrayList animals = new ArrayList();

	        // Add elements in the ArrayList
	        animals.add(100);
	        animals.add("Dog");
	        animals.add(true);
	        System.out.println("ArrayList: " + animals);

	        // get the element from the ArrayList
	        System.out.println("Element at index 1: " +animals.get(2));
	        
	        // change the element of the array list
	        animals.set(2, "Elephant");
	        System.out.println("Modified ArrayList: " + animals);
	        
	        // remove element from index 2
	        System.out.println("Updated ArrayList: " + animals);
	        

	        // find the position of Dog
	        int position= animals.indexOf("Dog");
	        System.out.println("Index of Dog: " + position);
	        
	        // checks if Cow is present in the arraylist
	        System.out.print("Is Dog present in the arraylist: ");
	        System.out.println(animals.contains("Dog"));
	        
	        // get the number of elements of arraylist
	        int size = animals.size();
	        System.out.println("Length of ArrayList: " + size);

	        
	      }
	    }


package com.game.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> tempExit = new HashMap<String,Integer>();
		locations.put(0, new Location(0, "you are sitting in front of a computer learning Java",tempExit));
		
		
		tempExit = new HashMap<String,Integer>();
		tempExit.put("W", 2);
		tempExit.put("E", 3);
		tempExit.put("S", 4);
		tempExit.put("N", 5);
		locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
		
		tempExit = new HashMap<String,Integer>();
		tempExit.put("N", 5);
		locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
		
		tempExit = new HashMap<String,Integer>();
		tempExit.put("W",1);
		locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
		
		tempExit = new HashMap<String,Integer>();
		tempExit.put("N", 1);
		tempExit.put("W", 2);
		locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
		
		tempExit = new HashMap<String,Integer>();
		tempExit.put("S", 1);
		tempExit.put("W", 2);
		locations.put(5, new Location(5, "You are in a forest",tempExit));
		
		command();
	}
		public static  void command() {
			int loc = 1;
			Scanner scanner = new Scanner(System.in);
			while(true) { 
				 
				System.out.println(locations.get(loc).getDescription());
				if(loc==0) { 
					break; 
				  	} 
				Map<String, Integer>exits =locations.get(loc).getExits(); 
				System.out.println("Available exits are ");
				for(String exit: exits.keySet()) {
					System.out.print(exit + ", "); 
					}
				System.out.println(); 
				String direction = scanner.nextLine().toUpperCase();
				String[] decision = direction.split(" ");
				for(String i:decision) {
					
					if(i.equals("NORTH") || i.equals("N")) {
						direction = "N";
						break;
					}
					if(i.equals("EAST") || i.equals("E")) {
						direction = "E";
						break;
					}
					if(i.equals("WEST") || i.equals("W")) {
						direction = "W";
						break;
					}
					if(i.equals("SOUTH") || i.equals("S")) {
						direction = "S";
						break;
					}
					if(i.equals("QUIT") || i.equals("Q")) {
						direction = "Q";
						break;
					}
				}
				System.out.println(direction);
				if(exits.containsKey(direction)) { 
					loc = exits.get(direction); 
					} 
					else {
						System.out.println("You cannot go in that direction"); 
						}
		  
		  }
		 
		}

}

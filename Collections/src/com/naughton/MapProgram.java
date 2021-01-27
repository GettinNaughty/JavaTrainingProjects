package com.naughton;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a compiled high level, OOP, platform independent");
		languages.put("Python", "a family of language");
		
		languages.put("BASIC", "Beginner's language");
		System.out.println(languages.get("Java"));
		languages.remove("BASIC");
		if(languages.remove("Python", "a family of languages")) {
			System.out.println("Python removed");
		}
		else {
			System.out.println("Python not removed");
		}
		System.out.println(languages.replace("Java", "A functional program"));
		for(String key:languages.keySet()) {
			System.out.println((key + " : "+ languages.get(key)));
		}
	}
}

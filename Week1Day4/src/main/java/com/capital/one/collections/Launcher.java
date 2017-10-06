package com.capital.one.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Launcher {
	public static void main(String[] args) {
		// Set<Integer> myInts = new HashSet<Integer>();
		// Set<Dog> myDogs = new HashSet<Dog>();
		// myDogs.add(new Dog("fifo", null, null));
		//
		// myDogs.add(new Dog("fifo", "brown", null));
		// System.out.println(myDogs);
		//
		// List<Dog> dogs = new ArrayList<Dog>();
		// dogs.add(new Dog("fifo", null, null));
		// dogs.add(new Dog("spot", null, null));
		// dogs.add(new Dog("heidi", null, null));
		// dogs.add(new Dog("sparky", null, null));
		// dogs.add(new Dog("scooby", null, null));
		//
		// Collections.sort(dogs);
		// System.out.println(dogs);
		//
		Map<String, String> dictionary = new HashMap<String, String>();

		dictionary.put("transient", "marking a field transient means it will not be serialized");
		dictionary.put("finalize",
				"Method that gets called by garbage collection before removing an object from memory");

		// System.out.println(dictionary.get("finalize"));
		// for (String key : dictionary.keySet()) {
		// System.out.println(key + ": " + dictionary.get(key));
		// }

		for (Entry<String, String> entries : dictionary.entrySet()) {
			System.out.println(entries.getKey() + ": " + entries.getValue());
		}

	}

}

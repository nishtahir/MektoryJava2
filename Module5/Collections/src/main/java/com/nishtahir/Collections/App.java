package com.nishtahir.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("hello", 50);
		myMap.put("world", 99);
		myMap.put("hello", 34);
		myMap.put("apple", 66);
		myMap.put("bananna", 22);
		myMap.put("candy", 77);
		myMap.put("potato", 11);
		myMap.put("java", 105);
		
//		Map<Box, Integer> boxMap = new HashMap<>();

//		Iterator<String>mapIter = myMap.keySet().iterator();
//		while(mapIter.hasNext()){
//			String key = mapIter.next();
//			System.out.println(myMap.get(key));
//		}
		
		Set<Box> mySet = new TreeSet<>();
		mySet.add(new Box("Apples", 55));
		mySet.add(new Box("Cherry", 22));
		mySet.add(new Box("Dragon Fruit", 77));
		mySet.add(new Box("Banana", 33));
		
		
//		System.out.println(myMap.get("hello"));
		
		List<String> myCollection = new ArrayList<>();
		myCollection.add("this");
		myCollection.add("is ");
		myCollection.add("a ");
		myCollection.add("list");
		
		Collections.sort(myCollection, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
		});
//		
//		Iterator<String> iter = myCollection.iterator();
//		while(iter.hasNext()){
//			String item = iter.next();
//			System.out.println(item);
//		}
		
		for(String item : myCollection){
			System.out.println(item);
		}
	}
}

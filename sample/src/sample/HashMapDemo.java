package sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.Data;



public class HashMapDemo {

	public static void main(String[] args) {
		
//		HashMap<String, String> myMap = new HashMap<String, String>();
//		myMap.put("Dhoni", "Batsmen");
//		myMap.put("Bhuvi", "Bowler");
//		myMap.put("Jadeja", "Fielder");
//		myMap.put("dinesh", "Wk");
		
		//iterating over key
//		Iterator<String> it = myMap.keySet().iterator();
//		while (it.hasNext()) {
//			String key =  it.next();
//			String value = myMap.get(key);
//			System.out.println("Name :"+ key+ "," + "dept :"+ value);
//			
//		}
//		System.out.println("------------------------------");
		
		//iterating over the set using entry set
//		Iterator<Entry<String, String>> setMap = myMap.entrySet().iterator();
//		
//		while (setMap.hasNext()) {
//			Entry<String, String> entrySet = setMap.next();
//			System.out.println("Name :"+entrySet.getKey()+","+"Dept :"+entrySet.getValue());
//		}
//		System.out.println("------------------------------");
		
		//iterating over using for each and lambda
//		myMap.forEach((k,v) -> System.out.println("Name :"+k+","+"Dept :"+v));
		
		
//		HashMap<Integer, String> map1 = new HashMap<>();
//		map1.put(1, "A");
//		map1.put(2, "B");
//		map1.put(3, "C");
//		map1.put(4, "C");
//		
//		HashMap<Integer, String> map2 = new HashMap<>();
//		map2.put(1, "A");
//		map2.put(2, "B");
//		map2.put(3, "C");
//		map2.put(4, "D");
		
		// on the basis of key value use equal method
//		System.out.println(map1.equals(map2));
		
		//on the basis of keysets
//		System.out.println(map1.keySet().equals(map2.keySet()));
		
//		finding extra element_value in both maps
//		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
//		combineKeys.addAll(map2.keySet());
//		combineKeys.removeAll(map1.keySet());
//		System.out.println(combineKeys);
		
		//jdk 8 using streams
		Map<String, String> map6 = Stream.of(new String[][] {
			{"Tom", "A grade"},
			{"bhemm", "A grade"}
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		map6.put("ram", "A grade");
		System.out.println(map6);
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

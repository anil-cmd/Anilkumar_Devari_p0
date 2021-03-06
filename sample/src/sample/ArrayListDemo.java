package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.DuplicateFormatFlagsException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;




public class ArrayListDemo {

	public static void main(String[] args) {
		
//	ArrayList<String> studentList = new ArrayList<String>();
//		
//		studentList.add("tom");
//		studentList.add("ram");
//		studentList.add("beem");
//		studentList.add("som");
//		studentList.add("raid");
//		
//	Object arr[] = studentList.toArray();
//	for(Object ar : arr) {
//		System.out.println(ar);
//	}
		
		
//		
////		typical for loop
//		for(int i=0; i<=studentList.size()-1; i++) {
//			System.out.println(studentList.get(i));
//		}
//		System.out.println("-----");
////		foreach loop
//		for(String student : studentList) {
//			System.out.println(student);
//		}
//		System.out.println("------");
//		
////		streamLambda
//		
//		studentList.stream().forEach(student -> System.out.println(student));
//		System.out.println("------");
//		
////		iterator
//		Iterator<String> student = studentList.iterator();
//		
//		while (student.hasNext()) {
//			System.out.println(student.next());
//		}
		
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//		numbers.removeIf(num -> num%2!=0);
//		ArrayList<Integer> newSubList = new ArrayList<Integer>(numbers.subList(0, 6));
//		System.out.println(newSubList);
//		System.out.println(numbers);
		
//		Collections.synchronized list
//		
//		List<String> myList = Collections.synchronizedList(new ArrayList<String>());
//		myList.add("python");
//		myList.add("java");
//		myList.add("c++");
//		
//		synchronized (myList) {
//			
//			Iterator<String> it = myList.iterator();
//			while (it.hasNext()) {
//				System.out.println(it.next());
//			}
//			
//		}
		
//		CopyOnWriteArrayList
		
//		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
//		empList.add("will");
//		empList.add("wgill");
//		empList.add("wikkll");
//		
//		empList.stream().forEach(emp -> System.out.println(emp));

//		to remove Duplicate	elements from array
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,6,7,8,9,8));
		
		LinkedHashSet<Integer> uniqueNumber = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> uniquArrayList = new ArrayList<Integer>(uniqueNumber);
		List<Integer> newList = uniquArrayList.stream().collect(Collectors.toList());
		System.out.println(newList);
		
//		remove duplicates using java streams
		List<Integer> numbersUnique = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(numbersUnique);
		
		//compare two arraylist in java
		

	}

}

package sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Scanner;


public class JavaProgramIntrospection {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the class name you want to introspect :");
		String className = scanner.nextLine();
		try {
		Class userClass = Class.forName(className);
		Constructor[] userClassCons = userClass.getConstructors();
		for(Constructor eachConstructor : userClassCons) {
		String nameOfModifier = Modifier.toString(eachConstructor.getModifiers());
		String nameOfCon =	eachConstructor.getName();
		System.out.println(nameOfModifier + " " + nameOfCon);
		Parameter[] eachConsParam = eachConstructor.getParameters();
			for(Parameter eachParam : eachConsParam) {
				String paramNameString = eachParam.getName();
				System.out.println(paramNameString);
			}
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}

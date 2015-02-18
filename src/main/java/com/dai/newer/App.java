package com.dai.newer;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	int age;

	public App() {
		age = 4;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static String reverse(String s) {
		List<String> tempArray = new ArrayList<String>(s.length());
		
		for (int i = 0; i < s.length(); i++) {
			tempArray.add(s.substring(i, i + 1));
		}
		
		StringBuilder reversedString = new StringBuilder(s.length());
		
		for (int i = tempArray.size() - 1; i >= 0; i--) {
			reversedString.append(tempArray.get(i));
		}
		
		return reversedString.toString();
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		App a = new App();
		System.out.println("App.age: " + a.getAge());
	}
	
	
}

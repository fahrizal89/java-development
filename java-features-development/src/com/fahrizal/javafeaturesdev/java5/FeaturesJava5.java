package com.fahrizal.javafeaturesdev.java5;

import java.util.List;
import java.util.ArrayList;
import static java.lang.Math.abs;

public class FeaturesJava5 {
	
	public static void main(String[] args) {
		FeaturesJava5 features= new FeaturesJava5();
		features.exampleEnhacedForLoop();
		features.exampleAutoboxing();
		
		features.exampleVariableLengthArgumentList("1");
		features.exampleVariableLengthArgumentList("1","2");
		features.exampleVariableLengthArgumentList("1","2","3");
	}
	
	private void exampleEnhacedForLoop() {
		String[] counts = { "one", "two", "three" };
		for (String str : counts) {
			System.out.println(str);
		}
	}
	
	private void exampleAutoboxing() {
		List list = new ArrayList<>();
		list.add(10);
		list.add(10.5);
		for (Object obj : list) {
		  System.out.println(obj);
		}
	}
	
	private void exampleVariableLengthArgumentList(String... parameters) {
		for (String str : parameters) {
			System.out.println("Paramters:-" + str);
		}
		System.out.println("");
	}
	
	private void exampleStaticImport() {
		System.out.println(abs(-100));
	}
}

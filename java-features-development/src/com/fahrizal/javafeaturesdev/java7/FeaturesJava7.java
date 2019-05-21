package com.fahrizal.javafeaturesdev.java7;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FeaturesJava7 {

	public static void main(String[] args) {
		FeaturesJava7 features= new FeaturesJava7();
		features.exampleDiamondOperator();
		features.exampleStringSwtichStatement();
		features.numericLiteralsWithUnderscores();
	}
	
	private void exampleDiamondOperator() {
		Map<String, List<String>> trades = new TreeMap<>();
	}
	
	private void exampleStringSwtichStatement() {
		String status = "b";

		switch(status) {
		case "a":
        	System.out.println("a");
          	break;
		case "b":
        	System.out.println("b");
            break;
        default:
              break;
        }
	}
	
	private void numericLiteralsWithUnderscores() {
		int thousand =  1_000;
		System.out.println(thousand);
	}
}

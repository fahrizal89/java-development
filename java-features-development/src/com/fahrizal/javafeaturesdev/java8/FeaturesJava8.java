package com.fahrizal.javafeaturesdev.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.fahrizal.javafeaturesdev.java7.FeaturesJava7;

public class FeaturesJava8 {
	public static void main(String[] args) {
		FeaturesJava8 features= new FeaturesJava8();
		features.lambdaExpression();
		features.stream();
	}
	
	private void lambdaExpression() {
		//before
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("My Runnable");
			}
		};
		
		//after
		Runnable r1 = () -> {
			System.out.println("My Runnable");
		};
		
		
		//before
		new ShowAlphabet() {
			@Override
			public void alphabet(String a) {
				System.out.println(a);
			}
		};
		
		//after
		ShowAlphabet interface1= (a)-> System.out.println(a); 
	}
	
	private void stream() {
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
	}
}

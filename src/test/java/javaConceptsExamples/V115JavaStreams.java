package javaConceptsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class V115JavaStreams {
	
	@Test
	public void regular() {
		//get count of names starting with "A" by regular method
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abjeeth");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for(int i=0; i<names.size();i++) {
			String actual= names.get(i);
			if(actual.startsWith("A"))
				count++;
		}
		System.out.println(count+" - by regular method");
	}
		
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abjeeth");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c+" - by stream method");
		
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if intermediate operation (filter) returns true
		//we can create stream
		//how to use filter in Stream API
		
		//using Stream API - without creating arrayList
		long d = Stream.of("Abjeeth","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			return (false);
		}).count();
		System.out.println(d);
		
		//print all the names of the array list with more than 4 characters
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//limiting the result- getting only 1 result
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}
	
	@Test
	public void streamMap() {
		//print names with last letter 'a' in uppercase
		Stream.of("Abjeeth","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//print names which have 1st letter A , and sorted
		List<String> names= Arrays.asList("Abjeeth","Don","Alekhya","Adam","Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	
	@Test 
	public void merg_Sort() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("woman");
		names.add("Brad");
		names.add("Cooper");
		
		List<String> names1= Arrays.asList("Abjeeth","Don","Alekhya","Adam","Rama");
		// using concat to merge
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		//to check there is any expected match in array
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect() {
		
		List<String> lg = Stream.of("Abjeeth","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(lg.get(0));
		
		//using numbers
		//print unique numbers
		//sort the array
		List<Integer> values = Arrays.asList(3,2,2,4,4,5,6,7,9);
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}

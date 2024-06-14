package javaConceptsExamples;

import java.util.ArrayList;

public class V025ArrayList_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array list concept
		ArrayList<String> w = new ArrayList<String>();
		w.add("ragul");
		w.add("chetty");
		w.add("academy");
		w.add("selenium");
		System.out.println(w.get(2));
		System.out.println("***************************");
		
		//iterating array list
		for(int i=0; i<w.size() ; i++) {
			System.out.println(w.get(i));
		}
		System.out.println("***************************");
		
		//iterating array list by enhanced method
		for(String val:w) {
			System.out.println(val);
		}
		System.out.println(w.contains("selenium"));
		
		//convert normal array to array list
		String [] names = {"Sheela","Sheeba","Robert","andrew"};
		System.out.println(names);
		

	}

}

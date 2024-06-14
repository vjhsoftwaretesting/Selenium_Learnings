package javaConceptsExamples;

public class V027String {

	public static void main(String[] args) {
		// string is an object that represent sequence of characters
		
		//string litral
		String s= "ragul cheety academy";
		
		//string new key word
		String s1 = new String("welcome");
		System.out.println(s1);
		
		//string methods
		String [] splitted = s.split("cheety");
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);
		System.out.println(splitted[1].trim());
		
		for(int i=0; i<s.length() ; i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("*************************");
		//print in reverse
		for(int i=s.length()-1; i>=0;i--) {
			System.out.println(s.charAt(i));
		}

	}

}

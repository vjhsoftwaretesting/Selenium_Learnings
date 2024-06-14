package javaConceptsExamples;

public class V028Method_AccessMethodConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V028Method_AccessMethodConcepts da = new V028Method_AccessMethodConcepts();
		da.getData();
		String name = da.stData();
		System.out.println(name);
		
		V028Method_AccessMethodConcepts_2 da2 = new V028Method_AccessMethodConcepts_2();
		String fe = da2.andata();
		System.out.println(fe);
		saData();

	}
	
	public void getData() {
		System.out.println("Hello digi world");
	}
	
	public String stData() {
		return "ragul cheety academy";
	}
	public static void saData() {
		System.out.println("static - no object required");
	}

}

package javaConceptsExamples;

public class V024Array_Forloop_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data types
		int num =6;
		String website = "rahul";
		char letter = 'r';
		double dec = 5.99;
		float oct = (float) 6.77;
		boolean mycard = true;
		System.out.println(num+website+letter+dec+oct+mycard + "is the value");
		
		//array
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[3]);
		
		//short form
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		
		//for loop
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//enhanced for loop
		for(int e:arr1) {
			System.out.println(e);
		}
		
		String [] name = {"rahul","chetty","academy","selenium"};
		// normal for loop
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		//enhanced for loop
		for(String q:name) {
			System.out.println(q);
		}
		
		//print only multiples of 2
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		for (int i =0; i<arr2.length; i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i]+" is not a multiple of 2");
			}
		}
		
		//check if array contains a multiple of 2
			//here no need to completely itereate in the arr2, if we find any 1 no. multiple of 2, then we can decide the arr2 has multiple of 2
			//so break key word is used
		for (int i =0; i<arr2.length; i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i]+" is not a multiple of 2");
			}
		}

	}

}

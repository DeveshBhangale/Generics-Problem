package com.genericsproblem;

public class MaximumTest<T extends Comparable<T>> {
	T a,b,c;

	public MaximumTest(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {
		//Use Case - 1 
//		Integer a=10,b=11,c=9;
//		int res = a.compareTo(b);
//		if(res==-1 || res == 0) {
//			int res1 = b.compareTo(c);
//			if(res1 == -1) {
//				System.out.println(c +" is maximum than "+b+" & "+a);
//			}
//			else if(res1 == 0) {
//				System.out.println("All three Integers are equal");
//			}
//			else {
//				System.out.println(b +" is maximum than "+c+" & "+a);
//			}
//		}
		
		// Use Case - 2
//		Float a =  1.1f, b= 1.1f, c = 1.1f;
//		int res = a.compareTo(b);
//		if(res==-1 || res == 0) {
//			int res1 = b.compareTo(c);
//			if(res1 == -1) {
//				System.out.println(c +" is maximum than "+b+" & "+a);
//			}
//			else if(res1 == 0) {
//				System.out.println("All three Floats are equal");
//			}
//			else {
//				System.out.println(b +" is maximum than "+c+" & "+a);
//			}
//		}
	
	
	// Use Case - 3
			String a = "Venkat", b = "vevesh", c = "vevesh";
			System.out.println(a.compareTo(b));
			System.out.println(a.compareTo(c));
			int res = a.compareTo(b);
			if(res<0 || res == 0) {
				int res1 = b.compareTo(c);
				if(res1 < 0) {
					System.out.println(c +" is maximum than "+b+" & "+a);
				}
				else if(res1 == 0 && res == 0) {
					System.out.println("All three Strings are equal");
				}
				else {
					System.out.println(b +" is maximum than "+c+" & "+a);
				}
			}
	}
}
		


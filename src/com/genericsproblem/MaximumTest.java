package com.genericsproblem;

public class MaximumTest<T extends Comparable<T>> {
	T a,b,c;

	public MaximumTest(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T maximum() {
		return MaximumTest.maximum(a,b,c);
	}
	
	public static <T extends Comparable<T>> T maximum(T a, T b,T c) {
		T max = a;
		if(b.compareTo(max) > 0) {
			max = b;
		}
		if(c.compareTo(max) > 0) {
			max = c;
		}
		print(a ,b ,c, max);
		return max;
	}
	
	public static <T> void print(T a, T b, T c, T max) {
		System.out.printf("Max of %s, %s, %s  is %s\n",a,b,c,max);
	}

	public static void main(String[] args) {
		//Use Case - 1 
//		Integer a=10,b=11,c=9;
//		int res = a.compareTo(b);
		
		// Use Case - 2
//		Float a =  1.1f, b= 1.1f, c = 1.1f;
//		int res = a.compareTo(b);

	// Use Case - 3
//			String a = "abc", b = "bcs", c = "zzv";
//			int res = a.compareTo(b);
//			if(res<0 || res == 0) {
//				int res1 = b.compareTo(c);
//				if(res1 < 0) {
//					System.out.println(c +" is maximum than "+b+" & "+a);
//				}
//				else if(res1 == 0 && res == 0) {
//					System.out.println("All three Strings are equal");
//				}
//				else {
//					System.out.println(b +" is maximum than "+c+" & "+a);
//				}
//			}
		Integer aInt=10,bInt=11,cInt=9;
		Float aF =  1.1f, bF = 2.0f, cF = 1.1f;
		String aStr = "abc", bStr = "bcs", cStr = "zzv";

		
		
		new MaximumTest(aInt,bInt,cInt).maximum();
		new MaximumTest(aF,bF,cF).maximum();
		new MaximumTest(aStr,bStr,cStr).maximum();
		
		
	}
}
		


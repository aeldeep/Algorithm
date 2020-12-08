package com.eldeep;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[]args)
	{
		int[]  n= {1,5,7,3,2,4} ;
		solution(n);
	}
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 Arrays.sort(A);
		 int result=0;
		 if (A.length>0 &&A[0]==1) {
		 for (int i = 0; i <A.length-1;i++)
		 {
			
			 if (A[i]+1!=A[i+1])
			 	{
				 result=A[i]+1;
			 	}
		 	}
		 if (result==0)
		 {
			 result=A[A.length-1]+1;
		 }
		 }else {
			 result=1;
		 }
		 System.out.println(result);
		 return result;
	 }


}

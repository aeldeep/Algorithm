package com.eldeep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main (String[] args)
	{
		int[]  n= {1} ;
		solution(1,n);
	}
	
	 public static int solution(int X, int[] A) {
		 
		 Set<Integer> list= new HashSet<>();
		 for (int i = 1; i<= X; i++){
			 list.add(i);
			 }
		 
		 for(int j = 0; j< A.length; j++){
		 if(list.contains(A[j])){
			 list.remove(A[j]);
		 if(list.isEmpty()){
		 return j;
		 }
		 }
		 }
		 return -1;
	        // write your code in Java SE 8
		/* int result = -1;
		 if (sort( X,A) == true) {
		 for (int i=0;i<A.length;i++)
		 {
			// System.out.println(A[i]);
			 if (A.length>0 && A.length<100001 && X>0 && X<100001 && A[i]<=X && A[i]>0)
			 {
			 if (A[i]==X)
			 {
				 result =i;
			 }else {continue;}
			 }
		 }
		 }
		 System.out.println(result);
		 return result;
	    }
	 public static boolean sort(int X,int [] A)
	 {
		 boolean result=false;
		 int [] B = A.clone();
		 
		 Arrays.sort(B);
		 if (B[0]!=1) {
			 return false;}
		 for (int i = 0; i<B.length;i++)
		 {
			 System.out.println(B[i]);
			 if (B[i]<=X && i<B.length-1 )
			 {
			 if (B[i+1]==B[i]+1 ||B[i+1]==B[i] || B[i]==X)
			 {
				 result= true;
			 }else {
				 result= false;
				 break;
			 }
			 }else {}
		 }
		 
		 System.out.println(result);
		 return result;*/
	 }
}

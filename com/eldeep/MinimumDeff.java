package com.eldeep;

import java.util.HashSet;
import java.util.TreeSet;

public class MinimumDeff {
	
	public static void main(String[]args)
	{
		/*int[]  n1= {1,5,7,3,2,4} ;

		int[]  n= {-1000,1000} ;
		solution1(n);*/
		

        // Create a HashSet 
        HashSet<String> hset = new HashSet<String>(); 
  
        // add elements to HashSet 
        hset.add("geeks"); 
        hset.add("for"); 
        hset.add("practice"); 
        hset.add("contribute"); 
  
        // Duplicate removed 
      hset.add(null); 
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : hset) { 
           // System.out.println(temp); 
        } 
        
        
        // Create a TreeSet 
        TreeSet<String> tset = new TreeSet<String>(); 
  
        // add elements to HashSet 
        tset.add("geeks"); 
        tset.add("for"); 
        tset.add("practice"); 
        tset.add("contribute"); 
  
        // Duplicate removed  null
    //    tset.add(null); 
  
        // Displaying TreeSet elements 
        System.out.println("TreeSet contains: "); 
        for (String temp : tset) { 
            System.out.println(temp); 
        } 
	}
	
	 public static int solution1(int[] A) {

		 int result=999999;
		 int N = A.length-1;
		 int count=0;
		 if (N>0 && N<100002)
		 {
			 for (int i = 0;i<=N;i++)
			 {
				 if (A[i]>=-1000 && A[i]<=1000)
				 {
					 count+=A[i];
				 }
			 }
			 
			 int j=N;
			 int count2=0;
			 int deff;

				do 
				{
					count2+=A[j];
					count-=A[j];
					j--;
					 deff= count-count2;
					 System.out.println("Count 1--> "+ count +"\nCount 2--> "+ count2 +"\ndeff is------>"+deff );
					 
					 if (deff<0)
					 {
						 deff=deff*-1;
						 if (result>deff)
						 {
							 result=deff;
						 }
					 }else {
						 if (result>deff)
						 {
							 result=deff;
						 }
					 }
				}
				while(j>0);
		 }
		 System.out.println(result);
		 return result;
	 }
	 
	 public static int solution(int[] A) {

		 int result=999999;
		 int N = A.length-1;
		 int count=0;
		 if (N>0 && N<100002)
		 {
			 for (int i = 0;i<=N-1;i++)
			 {
				 int deff;
				 count+=A[i];
				 int count2=0;
				 if (A[i]>=-1000 && A[i]<=1000)
				 {
					 int j=N;
					do 
					{
						count2+=A[j];
						j--;
					}
					while(j>i);
				 }
				 deff= count-count2;
				 System.out.println("Count 1--> "+ count +"\nCount 2--> "+ count2 +"\ndeff is------>"+deff );
				 if (deff<0)
				 {
					 deff=deff*-1;
					 if (result>deff)
					 {
						 result=deff;
					 }
				 }else {
					 if (result>deff)
					 {
						 result=deff;
					 }
				 }
			 }
		 }
		 System.out.println(result);
		 return result;
	 }
	 
	 


}

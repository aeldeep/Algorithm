package com.eldeep;

import java.util.Arrays;

public class UnPairedArray {
	public static void main(String[] args) {

		int[]  n= {1,2,3,2,3,1,8} ;
		//System.out.println(n);
		solution(n);
	}
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	Arrays.sort(A);  
    	
    	int n=A.length-1;
    	int num=0;
    	if (n%2==0&& n>=0)
    	{
    		for (int i = 0; i<=n;i++)
    		{
    			 num=A[i];
    			// System.out.println(i);
    			if (A[i]>=0 && i<n)
    			{
    				//System.out.println("A i  -->"+A[i] + "\nA i+1--> "+A[i+1]);
    				if (A[i]==A[i+1] )
    				{
    				//	System.out.println(A[i]);
    					A[i]=-1;
    					A[i+1]=-1;
    				
    				}else
    				{
    					//System.out.println("returned");
    					num=A[i];
    					break;
    				}
    			}
    			

    		}
    	}
    	System.out.println(num);
    	return num;
    }

}

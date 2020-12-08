package com.eldeep;

import java.util.List;

public class MinMov {

	 // Function to find minimum swaps 
    // to group all 1's together 
   
    
    static int countSwaps(int [] a) {
        int n0 = 0, i0 = 0, n1 = 0, i1 = 0;
        for (int p = 0; p < a.length; ++p) {
            if (a[p] == 0)
                n0 += p - i0++; // No. of steps to move the 0 to the left
            else
                n1 += p - i1++; // No. of steps to move the 1 to the left
        }
        	return Math.min(n0, n1); // Choose lowest no. of steps
    	}
    private void MinSwap(List <Integer> arr) {
		// TODO Auto-generated method stub


int numOfOneMoves = 0;
		int numOfOnes = 0;
		
		for(int i=0; i < arr.size(); i++) {
			if(arr.get(i) == 1) {
				numOfOneMoves = numOfOneMoves + i - numOfOnes;
				numOfOnes++;
			}
		}
		
		int numOfZeroMoves = 0;
		int numOfZeroes = 0;		
		
		for(int i=0; i < arr.size(); i++) {
			if(arr.get(i) == 1) {
				numOfZeroMoves = numOfZeroMoves + i - numOfZeroes;
				numOfZeroes++;
			}
		}
		
		Math.min(numOfOneMoves, numOfZeroMoves);

	}
    
      
    public static void main(String args[])  
    { 
        int a[] = new int[]{1,0,1,0,0,0,0,1}; 
        int n = a.length; 
          
        System.out.println(countSwaps(a));
       // swap(a); 
    } 
}

package com.eldeep;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PairArray {
	// Complete the pairs function below.
    static int pairs(int k, int[] arr) {
    /*    Arrays.sort(arr);
        int n=arr.length;
        int i=0;
        int count=0;
        for ( i = 0; i<n;i++)
        {
        	if ( i<n-1&& arr[i]>=0) {
            	if (arr[i]==arr[i+1])
            	{
            		arr[i]=-1;
            	}
        	}

        }
        for (i=0;i<n;i++)
        {
        	if (arr[i]>=0)
        	{
        		for (int c=i;c<n;c++)
        		{
        			if (arr[c]-arr[i]==k && arr[c]>=0)
        			{
        				count++;
        				arr[i]=-1;
        			}
        		}
        	}
        }
        System.out.println(count);
        return count;
*/
    	
    	int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr)
        {
            set.add(i);
        }
        

        for(int i : arr)
        {
            if(set.contains(i + k))
            {
                count++;
            }
        }
        return count;

    }
    
    public static int countPairs(List<Integer> numbers, int k) {
        // Write your code here
        
        int count = 0;
        int i = 0;
        int l=numbers.size();
        HashSet<Integer> hs=new HashSet<> ();
        for ( i=0 ; i<l;i++)
        {
            hs.add(numbers.get(i));
        }
        Integer []arr = hs.toArray(new Integer[0]);
        for (int c : arr)
        {
            if (hs.contains(c+k))
            {
                count++;
            }
        }
        return count;
        }


    public static void main(String[] args) throws IOException {
    	int[]  n= {1 ,3, 5 ,8 ,6, 4, 2} ;
    		pairs(2,n);
    }
}

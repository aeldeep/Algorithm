/**
 * 
 */
package com.eldeep;


import java.util.Arrays;


public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	int[]  n= {1,2,3,6,8,6} ;
	//	solution(n);
		
		int [] juice 	= {2, 2, 1, 1,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		int [] capacity = {40, 40, 40, 40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40};
	//	int [] j = {4, 7, 2};
	//	int [] c = {7, 8, 4};
		
		solution2(juice,capacity);
		//solution3(j,c);
		

	}

	
	
	public static int solution2(int[] juice, int[] capacity) {
		int N = juice.length;
		int result=1;
	if (N==capacity.length && N>1 )
	{
		int deff = 0;
		for (int i = 0; i<N;i++)
		{
	        deff = capacity[i]-juice[i];
	        if (deff >=0)
	        {
	            capacity[i]=deff;
	            System.out.println(deff);

	        }else{
	            break;
	        }
		}
		if (deff>=0) {
			for (int i=0;i<N;i++)
			{
				int count =1;
				deff=capacity[i];
				System.out.println("deff is ==> "+deff+"\n\n");

				if (deff!=0) {
					for(int k=0;k<N;k++)
					{
						if (i!=k && deff>0) {
							deff-=juice[k];
						System.out.println("deff is ==> "+deff + "  juice[dddd] is   --> "+juice[k]);
							if (deff>=0) {
								count++;
								System.out.println("count is => "+count);
							}
						}else if(deff<0){
							System.out.println("rollback");
							k--;
							deff+=juice[k];
						//	System.out.println("deff isgggg ==> "+deff + "juice[k] is   --> "+juice[k]+"\nCount -----------------> "+count);
						}
					}
				}

				if (count>result)
				{
					result=count;
				}
			}
		}
	}
	System.out.println(result);
	return result;
    	
    }
	
	public static int solution(int[] A) {
		 Arrays.sort(A);     
	        int min = 1; 
	        int cap = A.length;
	        
	        for (int i = 0; i < cap; i++){
	            if(A[i] == min){
	                min++;
	            }
	        }   
	        return min;    
	    }
	
	
	
	}
class Solution {
    public int solution(int[] juice, int[] capacity) {
        // write your code in Java SE 8
    	int count = 1;
    	int N = juice.length;
    	if (N>1&& N==capacity.length)
    	{
    		for (int c:capacity)
    		{
    			int sum=0;
    			for (int j: juice)
    			{
    				if (c>=j+sum)
    				{
    					sum=+j;
    					count++;
    				}
    			}
    		}
    	}
    	return count;
    	
    }
    
    
    
    public int [] merge(int[] a, int []b) {
    	int []result = new int [a.length+b.length];
    	for (int i = 0;i<a.length;i++)
    	{
    		result[2*i]=a[i];
    		result[(2*i)+1]=b[i];
    		System.out.println(result[2*i]);
    	}
    	return result;

    }
}

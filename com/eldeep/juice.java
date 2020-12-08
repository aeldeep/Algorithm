package com.eldeep;

import java.util.Arrays;

public class juice {

	
	public static void main(String[] args) {
		int[]  n= {1,2,3,6,8,6} ;
	//	solution(n);
		
		int [] juice 	= {10, 2, 1, 1};
		int [] capacity = {10, 3, 2, 2};
		int [] j = {1, 1, 5};
		int [] c = {6, 5, 8};
		
		solution(juice,capacity);
		solution(j,c);
	}
	
	public static int solution(int[] juice, int[] capacity) {
		int N = juice.length;
		int result=1;
		int maxj=-1;
		int value=0;
	if (N==capacity.length && N>1 )
	{
		int deff = 0;

		for (int i=0;i<N;i++)
		{
	        deff = capacity[i]-juice[i];
	        if (deff >=0)
	        {
	            capacity[i]=deff;
	            System.out.println(deff);
	            if (deff> value)
	            {
	            	value=deff;
	            	maxj=i;
	            }

	        }else{
	            break;
	        }
		}
		juice[maxj]=0;
		Arrays.sort(juice);
		for (int i=0;i<N;i++)
		{
			System.out.println("\njuice is -->"+juice[i]);
			if (value - juice[i]>=0 && juice[i]>0)
			{
				value-=juice[i];
				result++;
			//	System.out.println("\njuice is -->"+juice[i]);
				System.out.println("\nValue is -->"+value);
			}else {
			}
		}
	}
	System.out.println("\nresult is -->"+result);
	return result;
  }
}

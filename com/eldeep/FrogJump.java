package com.eldeep;

public class FrogJump {
	public static void main (String[] args)
	{
		solution(10,85,30);
	}
	
	public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		int result=0;
		if (X<Y && X>=0 && D>0)
		{
			int deff=Y-X;
			 result= (deff%D ==0)?deff/D : deff/D+1;
		}
		return result;
    }
}

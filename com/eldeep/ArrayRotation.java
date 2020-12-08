package com.eldeep;

public class ArrayRotation {
	
	public static void main(String[] args) {

		int[]  n= {1,2,3,6,8,6} ;
		//System.out.println(n);
		solution(n,3);
	}
	
    public static int addNumbers(float a, float b) {
    // Write your code here
        int result ;
        float f= Float.sum(a,b);
        result= (int) f;
        return result;

    }
	public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int l=A.length-1;
		if (l>=0) {
		for ( ;K>0;K--)
		{
			int last = A[l];
			for (int r=l;r>0;r--)
			{
				A[r]=A[r-1];
			}
			A[0]=last;
		}
		}
		System.out.println(A.toString()+"");
		
		return A;
    }

}

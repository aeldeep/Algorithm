package com.eldeep;

public class BinaryGap {
	
	public static void main(String[] args) {
		solution(561892);
	}
	public static int solution(int N) {
        // write your code in Java SE 8
		int gap=0;
		int count=0;
		if (N<1)
		{
			return 0;
		}
		 char binary[] = Integer.toBinaryString(N).toCharArray();
		 System.out.println(binary);
		 for (int i=0;i<binary.length;i++)
		 {
			 if(binary[i]=='0')
			 {
				 count++;
				 System.out.println("Number is 0 -->"+binary[i]+"  And Count now is -->"+count);
			 }
			 else if (binary[i]=='1')
			 {
				 if(count>gap)
				 {
					 gap=count;
					 count=0;
				 }else {
					 count=0;
				 }
			 } 
		 }
		 System.out.println(gap);
		 return gap;
    }

}

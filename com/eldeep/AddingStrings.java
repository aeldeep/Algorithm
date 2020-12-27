package com.eldeep;

public class AddingStrings {
	
	public static void main(String[] args) {
		System.out.println(addString("0","0"));
	}
	private static String addString(String num1, String num2) {
	      StringBuilder res = new StringBuilder();

	        int carry = 0;
	        int l1 = num1.length() - 1;
	        int l2 = num2.length() - 1;
	      // num1.length()>num2.length()?num1.length():num2.length();
	        for (int i= num1.length()>num2.length()?num1.length():num2.length();i>=0;i--)
	        {
	        	int nu1=l1 >=0? num1.charAt(l1)-'0':0;
	        	int nu2=l2 >=0? num2.charAt(l2)-'0':0;
	        	int val=(nu1+nu2+carry)%10;
	        	carry=(nu1+nu2+carry)/10;
	        	res.append(val);
	        	l1--;
	        	l2--;
	        }
	        
	        if (carry != 0)
	            res.append(carry);
	        
	        return res.reverse().toString();
	}

}

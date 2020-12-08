package com.eldeep;

public class AtringShifting {
public static void main(String[] args) {
	stringShift("Hello",1,2);
}
	
	
	public static String stringShift(String s, int left,int right) {
		boolean rightDir=false;
		int shift=(left>right)?left-right:right-left;
		if (right > left) {
			rightDir=true;
		}
		System.out.println(shift);
		int start =s.length()-shift-1; 
		String result=s.substring(shift);
		result=result;
		System.out.println(result);
		System.out.println("start "+start);
		return result;


	  }

}

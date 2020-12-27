package com.eldeep;

import java.io.IOException;
import java.util.Scanner;

/* 
  Given the time in numerals we may convert it into words, as shown below:
	At , use o' clock. For , use past, and for  use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.

Function Description

	Complete the timeInWords function in the editor below.
	timeInWords has the following parameter(s):
	int h: the hour of the day
	int m: the minutes after the hour
	Returns
	string: a time string as described
Input Format
The first line contains , the hours portion The second line contains , the minutes portion

Constraints
	Sample Input 0
		5
		47
	Sample Output 0
		thirteen minutes to six
		
	Sample Input 1
		3
		00
	Sample Output 1
		three o' clock
		
	Sample Input 2
		7
		15
	Sample Output 2
		quarter past seven
  
  */
public class TimeInWords {

	public static void main(String[] args) throws IOException {
		//System.out.println(timeInWords(10, 30));

        //Enter data using BufferReader 
		Scanner in = new Scanner(System.in); 
         
        // Reading data using readLine 
        int h = in.nextInt(); 
        int m = in.nextInt(); 
        // Printing the read line 
        if (h<=24 && m<60)
        {
            System.out.println(timeInWords(h,m));      
        }else {
        	System.out.println("Please Enter The Right Time ;)");;
        }
		    }
	
static String timeInWords(int h, int m) {
	//n3araf 30 mins in Words
  String words[]= { "zero", "one", "two", "three", "four","five", 
                    "six", "seven", "eight", "nine","ten", "eleven", 
                    "twelve", "thirteen","fourteen", "fifteen", "sixteen", 
                    "seventeen","eighteen", "nineteen", "twenty","twenty one", 
                    "twenty two", "twenty three", "twenty four","twenty five", 
                     "twenty six", "twenty seven","twenty eight", "twenty nine"}; 

 String result = "please enter Time";
 //check conditions 
	if (m == 0) {
	      result = words[h] + " o' clock";
	    } else if (m == 15) {
	        result= "quarter past "+ words[h];
	    } else if (m==30) {
	        result = "half past " +words[h];
	        } else if (m==45) {
	            result = "quarter to "+ words[h+1];
	        }else if  (m==1){
	            result = "one minute past "+ words[h];
	            }else if (m<30){
	            result = words[m] + " minutes past "+ words[h];
	        }  else {
	                result = words[60-m]+" minutes to "+words[h+1];
	            }
	return result ;
    }
}

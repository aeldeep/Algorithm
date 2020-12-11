package com.eldeep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
	public static void main(String[] args) {
		String []n= {"test.ema.il+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		numUniqueEmails(n);
	}
    public static int numUniqueEmails(String[] emails) {
    	Set <String> em = new HashSet<>(Arrays.asList(emails));
    	Set <String> res = new HashSet<>();
        String name;
      //  String domain;
        for (String e:em)
        {
        	int indp = -1;
        	int ind=e.indexOf("@");
        	 indp=e.indexOf("+");
        	if (indp>-1)
        	{
        		name=e.substring(0, indp);
        	}else {
            	name = e.substring(0, ind);
        	}
        	if (name.contains("."))
        	{
        		name=name.replace(".", "");
        	}
        	//domain=e.substring(ind);
        	res.add(name+e.substring(ind));
        }
      //  em.clear();
        
        System.out.println(res.size());
        return res.size();
    }

}

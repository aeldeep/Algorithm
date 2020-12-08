package com.eldeep;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
	List <Employee> e1=new ArrayList <>();
	e1.add(new Employee (1,"emp1",30, "Male", "Sec", 2011,3500.00));
	e1.add(new Employee (2,"emp1",38, "Female", "HR", 2012,3200.00));
	e1.add(new Employee (3,"emp1",25, "Male", "infoSec", 2013,3100.00));
	e1.add(new Employee (4,"emp1",24, "Female", "IT", 2014,3300.00));
	e1.add(new Employee (5,"emp1",26, "Male", "Sales", 2010,5400.00));
	e1.add(new Employee (6,"emp1",21, "Female", "SYSAdmin", 5200,3500.00));
	e1.add(new Employee (7,"emp1",32, "Female", "Sec", 2013,5100.00));

	int male=0 , female=0;
	for (Employee e:e1)
	{
		if ( e.gender.equals("Male"))
		{
			male++;
		}else {
			female++;
		}
	}
	System.out.println("we have "+male+" Males"+" And "+female+" Females");
	String type="Female";
	long mal;
	long fem = e1.stream().filter(e->e.gender.equals(type)).count();
	mal=e1.size()-fem;
	System.out.println(" we have "+fem+" of "+type+ "\n and we have "+mal +" Male");
}
//how many male and female are there 




}

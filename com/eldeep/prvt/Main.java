package com.eldeep.prvt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Ahmed ElDeeP
 * @since  12092020
 *
 */
public class Main {
	
public static void main(String[] args) {
	//declaring Variables and Collections
	List <DSN> d1=new ArrayList<>();
	List<String> w=new ArrayList<String>();
	List<String> b=new ArrayList<String>();
	String name;
	LocalDateTime oldDate;
	LocalDateTime newDate;
	String currentState;
	String newState;
	//Date Formatter
	DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
	BufferedReader reader;
	
	//Read from Input.log file and compare the state depending to date
	try {
		reader = new BufferedReader(new FileReader(
				"/E:\\Input.log"));
		String line = reader.readLine();
		
		while (line != null) {
			
			if (line.contains("--"))
			{
				line = reader.readLine();
			}else {
				String[] data = line.split(" ");
				data[0]=data[0].replace(",", ".");
				oldDate=LocalDateTime.parse(data[0],formatter);
				newDate=LocalDateTime.parse(data[0],formatter);
				name = data[1];
				currentState=data[2];
				newState = data[4];
				//Check if the DSN has a record in the List or NOt YET
				DSN num = d1.stream().filter(o->o.getName().equals(data[1])).findFirst().orElse(null);
				if (num!=null)
				{
					int ind;
					ind = d1.indexOf(num);
					//Compare The LocalDateTime And update The State
					if (d1.get(ind).getNewDate().isBefore(newDate))
					{
						d1.get(ind).setNewState(newState);
						d1.get(ind).setNewDate(newDate);
					}else if (d1.get(ind).getOldDate().isAfter(oldDate))
					{
						d1.get(ind).setCurrentState(currentState);
						d1.get(ind).setOldDate(oldDate);
					}
				}else
				{
					DSN d= new DSN(oldDate,newDate,name,currentState,newState);
					d1.add(d);
				}
				line = reader.readLine();
			}
		}
		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
// Filtering The White and black
	for (int i=0;i<d1.size();i++)
	{
		if (d1.get(i).getCurrentState()!="OUT_OF_USE"&&d1.get(i).getNewState().equals("OUT_OF_USE"))
		{
			System.out.println("Black List "+ d1.get(i).getName());
			b.add(d1.get(i).getName());
		}else if (d1.get(i).getCurrentState().equals("OUT_OF_USE")&&d1.get(i).getNewState()!="OUT_OF_USE")
		{
			System.out.println("White List "+ d1.get(i).getName());
			w.add(d1.get(i).getName());
		}
	//	System.out.println(d1.get(i));
	}

// Creating Output File and Insert Data formated as requested
    try {
        FileWriter myWriter = new FileWriter("E://Output File.txt");
        myWriter.write("--------- Output File Starts ------------------------------------\n");
        myWriter.write("DSNs needing blacklist:\n");
        for(String s:b)
        {
            myWriter.write(s+"\n");        	
        }
        myWriter.write("\nDSNs needing whitelist:\n");
        for(String s:w)
        {
            myWriter.write(s+"\n");     	
        }
        myWriter.write("--------- Output File Ends --------------------------------------");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
  
}
}
//DSN class
class DSN{
	private LocalDateTime oldDate;
	private LocalDateTime newDate;
	private String name;
	private String currentState;
	private String newState;
	
	
	public DSN(LocalDateTime oldDate, LocalDateTime newDate, String name, String currentState, String newState) {
		super();
		this.oldDate = oldDate;
		this.newDate = newDate;
		this.name = name;
		this.currentState = currentState;
		this.newState = newState;
	}


	@Override
	public String toString() {
		return "DSN [oldDate=" + oldDate + ", newDate=" + newDate + ", name=" + name + ", currentState=" + currentState
				+ ", newState=" + newState + "]";
	}


	public LocalDateTime getOldDate() {
		return oldDate;
	}


	public void setOldDate(LocalDateTime oldDate) {
		this.oldDate = oldDate;
	}


	public LocalDateTime getNewDate() {
		return newDate;
	}


	public void setNewDate(LocalDateTime newDate) {
		this.newDate = newDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCurrentState() {
		return currentState;
	}


	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}


	public String getNewState() {
		return newState;
	}


	public void setNewState(String newState) {
		this.newState = newState;
	}
}

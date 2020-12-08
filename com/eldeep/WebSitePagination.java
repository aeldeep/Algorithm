package com.eldeep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebSitePagination {
	public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
	    // Write your code here
	    

	    List<String> result= new ArrayList<>();
	    int itemSize=items.size();
	    Comparator<List<String>> mycompasc=(e1,e2)->e1.get(sortParameter).compareTo(e2.get(sortParameter));
	    
	    Comparator<List<String>> mycompdes=(e1,e2)->e2.get(sortParameter).compareTo(e1.get(sortParameter));
	    if (itemsPerPage>0&& pageNumber >=0 && itemsPerPage<20 &&itemSize>0)
	{
	        
	    
	    if (sortOrder==0)
	    {
	        Collections.sort(items,mycompasc);
	    } else if (sortOrder==1)
	    {
	        Collections.sort(items,mycompdes);
	    }
	    int num = itemSize/itemsPerPage;
	    int index = pageNumber*itemsPerPage;
	    if (pageNumber+1>num)
	    {
	        return result;
	    }
	    for (int i=index; i<(itemsPerPage*(pageNumber+1));i++)
	    {

	            result.add(items.get(i).get(0));
	    }
	}
	   return result;

	    }

	}


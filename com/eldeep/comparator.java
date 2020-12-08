package com.eldeep;

import java.util.Comparator;

public class comparator<T> implements Comparator<T>{

	/*    @Override
	    public int compare(Player a, Player b){
	        if (a.score == b.score){
	            return a.name.compareTo(b.name);//alphabetically
	        } else {
	            return b.score - a.score;//decreasing 
	        }
	    }
	}*/

	
	
@Override
public int compare(T a, T b){
    if (a == b){
        return ((Integer) a).compareTo((Integer)b);//alphabetically
    } else {
        return (Integer)b -(Integer) a;//decreasing 
    }
}
}
	

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

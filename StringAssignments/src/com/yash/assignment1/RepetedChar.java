package com.yash.assignment1;

public class RepetedChar {
	
	 static final int NO_OF_CHARS = 256;
	 
	    static void fillCharCounts(String str, int[] count)
	    {
	        for (int i = 0; i < str.length(); i++)
	            count[str.charAt(i)]++;
	    }
	 
	   
	    static void printDuplicate(String str)
	    {
	       
	        int count[] = new int[NO_OF_CHARS];
	        fillCharCounts(str, count);
	 
	        for (int i = 0; i < NO_OF_CHARS; i++)
	            if (count[i] > 1)
	                System.out.println("Charactor = "+(char)(i) + ", count = " + count[i]);
	    }
	 
	
	    public static void main(String[] args)
	    {
	        String str = "YASH TECHNOLOGIES";
	        printDuplicate(str);
	    }
	}
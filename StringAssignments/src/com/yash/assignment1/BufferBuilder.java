package com.yash.assignment1;

public class BufferBuilder {

	  public void BufferDemo()
	    {
	        StringBuffer buffer=new StringBuffer("Buffer stream");
	        
	    }
	    
	    public void BuilderDemo()
	    {
	        StringBuilder buffer=new StringBuilder("Builder stream");
	        
	    }
	public static void main(String[] args) {
		BufferBuilder bb=new BufferBuilder();
        long start1 = System.nanoTime();
        bb.BufferDemo();
        long end1 = System.nanoTime();
        System.out.println("Start time For buffer " + start1 + "End Time " + end1);
        
        long start2 = System.currentTimeMillis();
        bb.BuilderDemo();
        long end2 = System.currentTimeMillis();
        System.out.println("Start time For Builder " + start2 + "End Time " + end2);
        
        



   }



}

package com.yash.assignment1;

import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {
		
		String newString=new String();
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter First string: ");  
		String str1= sc.nextLine();   
		
		System.out.print("Enter Second string: ");  
		String str2= sc.nextLine(); 
		
		System.out.print("Enter Index: ");  
		int index= sc.nextInt();
		
		for(int i=0;i<str1.length();i++)
		{
			newString+=str1.charAt(i);
			if(i==index)
			{
				newString+=str2;
			}
			
		}
		System.out.println("New String: "+newString);
		            
		}  

	}



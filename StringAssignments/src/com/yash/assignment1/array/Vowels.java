package com.yash.assignment1.array;

public class Vowels {
	public static void main(String[] args) {
		
	
	
	String line = "yash technologies.";
    int vowels = 0;
    int consonants = 0;

    line = line.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);

      // check if character is any of a, e, i, o, u
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }

      // check if character is in between a to z
      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
      }
     
    }
    
    System.out.println("Vowels= "+vowels);
    System.out.println("Constant= "+consonants);
 
	}
    }

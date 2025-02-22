package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		int input = 121, output = 0, remainder;
	    int originalNum = input;
	    while (input != 0) {
	      remainder = input % 10;
	      output = output * 10 + remainder;
	      input /= 10;
	    }	    
	    if (originalNum == output) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
	}


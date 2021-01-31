package romanToInteger;

import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		System.out.print("What is your Roman number: ");
		try {
			s = scan.nextLine(); 
		    scan.close();
		    s = s.toUpperCase();
		    for (int i = 0; i < s.length(); i++) {
		    	if(s.charAt(i) == 'I' || s.charAt(i) == 'V' || s.charAt(i) == 'X' ||
		    	   s.charAt(i) == 'L' || s.charAt(i) == 'C' || s.charAt(i) == 'D' ||
		    	   s.charAt(i) == 'M') {
		    		continue;
		    	}else {
		    		throw new IllegalArgumentException("Wrong Input!");
		    	}
		    }
			int output = 0;
	        for (int i = 0; i < s.length(); i++){
	            switch (s.charAt(i)){
	                case 'I':
	                    if (i != (s.length()-1) && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')){
	                        output -= 1;
	                    }else{
	                        output += 1;
	                    }
	                    break;
	                case 'V':
	                        output += 5;
	                    break;
	                case 'X':
	                    if (i != (s.length()-1) && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')){
	                        output -= 10;
	                    }else{
	                        output += 10;
	                    }
	                    break;
	                case 'L':
	                        output += 50;
	                    break;
	                case 'C':
	                    if (i != (s.length()-1) && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')){
	                        output -= 100;
	                    }else{
	                        output += 100;
	                    }
	                    break;
	                case 'D':
	                        output += 500;
	                    break;
	                case 'M':
	                        output += 1000;
	                    break;
	            }
	        }
	    	System.out.println(output);
		}catch(Exception e) {
			s = null;
			System.out.print("Wrong Input!");
		}
	}
}

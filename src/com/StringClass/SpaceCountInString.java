package com.StringClass;

// Count the Space in String

public class SpaceCountInString {
	
	public static void main(String[] args) {

		String str = "Count the spaces given in this String";

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {        // we use...traversing...to get elements...for length of string

			char ch = str.charAt(i);    // charAt(i)...find location of character for each count
			if (ch == ' ') {          // it will break when there is Space 
				counter++;
			}
		}
		System.out.println("total space  are==" + counter);
	}


}

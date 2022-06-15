//Write a program to check whether the given input string is a palindrome.

import java.util.Scanner;

class JavaTest1 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String inputString = sc.nextLine();
		System.out.println(inputString);
		
		//converting to lowercase
		String lowerCaseString = inputString.toLowerCase();
		
		int i = 0;
		int j = lowerCaseString.length() - 1;
		
		boolean isPallindrome = true;
		
		//Checking the characters in string inputString
		while(i < j) {
			
			if(lowerCaseString.charAt(i) != lowerCaseString.charAt(j)) {
				isPallindrome = false;
				break;
			}
			
			i++;
			j--;
		}
		
		if(isPallindrome == true)
			System.out.println("String " + inputString + " is a pallindrome.");
		else
			System.out.println("String " + inputString + " is not a pallindrome.");
	}
}
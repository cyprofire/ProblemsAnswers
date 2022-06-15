//There is an integer array with number of elements {2,3,9,1,0,2}. For k=3, maximum sum = 14, k=number of elements

import java.util.Scanner;

class JavaTest2 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);
		int temp;
		int maxSum = 0;
		int[] arr = {2, 3, 9, 1, 0, 2};
		
		System.out.println("Enter the number of elements (k): ");
		int k = sc.nextInt();
		
		if(k < 6) {
			//Applying bubble sort on the array to get it sorted in Descending order
			for(int i = 0; i < arr.length; ++i) {
				for(int j = i+1; j < arr.length; ++j) {
					if(arr[i] < arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			//Calculating the sum of elements
			for(int i = 0; i < k; ++i) {
				maxSum += arr[i];
			}
			
			System.out.println("The maximum sum for " + k + " elements is: " + maxSum);
		}
		else {
			System.out.println("Wrong input...Greater than array range.");
		}
		
	}
}
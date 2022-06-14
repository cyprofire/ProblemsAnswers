import java.util.Scanner;

public class HourGlass {

	public static void main(String[] Args){

		System.out.println("Enter any odd number for hour glass:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num % 2 != 0)
		{
			System.out.println("Number is odd. The hourglass formed is:");
			
			for(int i = num; i > 0; i--){				//Upper half of hour glass
			    if(i % 2 != 0) {
			    	for(int j = num-i; j > 0; j--){		//Printing the spaces
			    		System.out.print(" ");
			    	}
			    	for(int j = i; j > 0; j--){			//Printing the * character
			    		System.out.print("* ");
			    	}
			    	System.out.println("");				//Line break
			    }
			}
			
			for(int i = 2; i <= num; i++){				//Lower half of hour glass
			    if(i % 2 != 0) {
			    	for(int j = num-i; j > 0; j--){		//Printing the spaces
			    		System.out.print(" ");
			    	}
			    	for(int j = i; j > 0; j--){			//Printing the * character
			    		System.out.print("* ");
			    	}
			    	System.out.println("");				//Line break
			    }
			}
		}

		else
			System.out.println("The number is even. No hourglass is formed.");
	}
}

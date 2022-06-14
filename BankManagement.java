import java.util.Scanner;
import java.lang.Math;

public class Assignment2_v3 {
	static Scanner sc = new Scanner(System.in);
	
	//Function to check the validation for Card number and Account number
	static int checkValidation(int numToCheck, String menuName) {
		int result = (int)Math.log10(numToCheck) + 1 ;

		System.out.println("Validating Input...");

		if(result == 8) {
			System.out.println("Input is valid.");
			System.out.println("Thank you for " + menuName +  " number");
			return 0;
		} else {
			System.out.println("Invalid " + menuName + " number");
			System.out.println("Number should be 8 digits only.");
			return 1;
		}
	}
	
	//Function to handle the loans
	static void loans() {
		System.out.println("LOANS:");
		System.out.println("Press 1 for Personal Loan.");
		System.out.println("Press 2 for Housing Loan.");
		System.out.println("Press 3 for Car Loan.");
		System.out.println("Press 4 for Gold Loan.");
		System.out.println("Press 9 to go back to previous menu.");
		int loanMenuOption = sc.nextInt();
		
		switch(loanMenuOption) {
			case 1: System.out.println("Sending Application for Personal Loan...");
					System.out.println("Application for Personal Loan Sent.");
					break;
					
			case 2: System.out.println("Sending Application for Housing Loan...");
					System.out.println("Application for Housing Loan Sent.");
					break;
			
			case 3: System.out.println("Sending Application for Car Loan...");
					System.out.println("Application for Car Loan Sent.");
					break;
			
			case 4: System.out.println("Sending Application for Gold Loan...");
					System.out.println("Application for Gold Loan Sent.");
					break;
					
			case 9: System.out.println("Taking you back to previous menu.");
				break;
				
			default: System.out.println("Wrong Input.");
		}
		
	}
	
	//Function for all types of accounts
	static void accounts(String accountName) {
		System.out.println(accountName.toUpperCase() + " ACCOUNT:");
		
		int tryAgainOrExit = -1;
		int validationResult = -1;
		
		do {
			if (validationResult == -1) {
				
				//account number validation
				System.out.println("Please enter you Account Number(8 Digits): ");
				int accountNumber = sc.nextInt();
				validationResult = checkValidation(accountNumber, accountName + " Account");
			}
			
			if(validationResult == 0) {
				
					validationResult = -1;
					System.out.println("Press 1 to show account balance.");
					System.out.println("Press 2 to speak to customer care.");
					System.out.println("Press 9 to go back to previous menu.");
					int accountMenuOption = sc.nextInt();
					
					switch(accountMenuOption) {
					
						case 1: System.out.println("Querying Account Balance...");
								System.out.println("Your account balance is $10000000.");
								break;
						
						case 2: System.out.println("Contacting customer care...");
								System.out.println("Customer care will call you soon.");
								break;
						
						case 9: System.out.println("Taking you back to previous menu.");
								break;
						
						default: System.out.println("Wrong Input.");
					}
					tryAgainOrExit = -1;
			} else {
				
				validationResult = -1;
				System.out.println("Enter 0 to try again.");
				System.out.println("Enter 9 to go back to previous menu.");
				tryAgainOrExit = sc.nextInt();

				if (tryAgainOrExit == 0) {
					System.out.println();
				} else if (tryAgainOrExit == 9) {
					System.out.println();
					break;					
				} else {
					System.out.println("Wrong Input.");
				}
			}
		} while (tryAgainOrExit == 0);
	}
	
	//Function to setup the cards menu
	static void cardsMenu() {
		System.out.println("\nCARDS:");
		System.out.println("Press 1 for Credit Card.");
		System.out.println("Press 2 for Debit Card.");
		System.out.println("Press 9 to go back to previous menu.");
		int cardsMenuOption = sc.nextInt();
		
		switch (cardsMenuOption) {
		
			case 1: System.out.println("Taking you to Credit Card section...");
					cards("Credit");
					break;
			
			case 2: System.out.println("Taking you to Debit Card section...");
					cards("Debit");
					break;
			
			case 9: System.out.println("Taking you back to previous menu.");
					break;
			
			default: System.out.println("Wrong Input.");
		}
		
	}
	
	//Function for all cards
	static void cards(String cardName) {
		System.out.println("\n" + cardName.toUpperCase() + " CARD:");
		
		int tryAgainOrExit = -1;
		int validationResult = -1;
		
		do {
			
			//credit card number validation
			System.out.println("Please enter your " + cardName + " Card Number(8 Digits): ");
			int cardNumber = sc.nextInt();
			validationResult = checkValidation(cardNumber,cardName + " Card");
			
			if (validationResult == 0) {
			
				System.out.println("Press 1 to block your card.");
				System.out.println("Press 2 to speak to customer care.");
				System.out.println("Press 9 to go back to previous menu.");
				int cardMenuOption = sc.nextInt();
				
				switch(cardMenuOption) {
				
					case 1: System.out.println("Blocking your " + cardName + " Card...");
							System.out.println("Your " + cardName + " Card has been successfully blocked.");
							break;
					
					case 2: System.out.println("Contacting customer care...");
							System.out.println("Customer care will call you soon.");
							break;
							
					case 9: System.out.println("Taking you back to previous menu.");
							break;
					
					default: System.out.println("Wrong Input.");
				}
				tryAgainOrExit = -1;
			} else {
				validationResult = -1;
				System.out.println("Enter 0 to try again.");
				System.out.println("Enter 9 to go back to previous menu.");
				tryAgainOrExit = sc.nextInt();
				
				if (tryAgainOrExit == 0)
					System.out.println();
				else if (tryAgainOrExit == 9) {
					System.out.println();
					break;
				}
				else
					System.out.println("Wrong Input.");
			}
		} while (tryAgainOrExit == 0);
	}
	
	//Function to clear the screen a bit
    public static void clearScreen() {  

        for (int i = 0; i < 2; ++i) 
        	System.out.println();
     } 

    //Driver Function
	public static void main(String[] args) {
		
		int mainMenuOption = -1;
		
		do {
		
			if (mainMenuOption != -1)
				clearScreen();

			System.out.println("###############Welcome to Anant's Bank.###############");
			System.out.println("The bank menu is as follows:");
			
			System.out.println("Press 0 to exit");
			System.out.println("Press 1 for loans");
			System.out.println("Press 2 for savings account");
			System.out.println("Press 3 for current account");
			System.out.println("Press 4 for cards");
			
			System.out.println("Enter the menu option to use the Mobile Bank Functions.");
			mainMenuOption = sc.nextInt();
			
			//main menu
			switch (mainMenuOption) {
			
				case 0: System.out.println("Exiting...");
						break;
				
				case 1: System.out.println("Taking to Loans section...");
						loans();
						break;
				
				case 2: System.out.println("Taking to Saving Account section...");
						accounts("Savings");
						break;
				
				case 3: System.out.println("Taking to Current Account section...");
						accounts("Current");
						break;
				
				case 4: System.out.println("Taking to Cards section...");
						cardsMenu();
						break;
						
				default: System.out.println("Wrong Input.");
			}
		} while (mainMenuOption != 0);
	}
}

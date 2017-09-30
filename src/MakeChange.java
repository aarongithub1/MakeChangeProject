import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double itemPrice = 0.0, amntGiven = 0.0, totalchangeDue = 0.0, coinsDue = 0;
		double convertChange = 0.0, convertBills = 0.0;
		int billsDue = 0;
		

		do {

			// The user is prompted asking for the price of the item.
			System.out.print("Enter the item price: ");
			itemPrice = kb.nextDouble();

			// The user is then prompted asking how much money was tendered by the customer.
			System.out.print("Enter the amount of money you gave the cashier? ");
			amntGiven = kb.nextDouble();

			// Display an appropriate message if the customer provided too little money or
			// the exact amount.
			if (itemPrice > amntGiven) {
				System.out.println("You didn't provide enough money, \n");
				System.out.print("Enter the amount of money you gave the cashier? ");
				amntGiven = kb.nextDouble();
			}

			totalchangeDue = amntGiven - itemPrice;
			System.out.println("\nYour change is: $" + totalchangeDue);
			billsDue = (int) totalchangeDue;
			
			int count = 0;
			
			count = billsDue / 20;
			System.out.println("\nchange is " + count + " $20 Dollar bills");
			billsDue %= 20;
			
			count = billsDue / 10;
			System.out.println("change is " + count + " $10 Dollar bills");
			billsDue %= 10;
			
			count = billsDue / 5;
			System.out.println("change is " + count + " $5 Dollar bills");
			billsDue %= 5;
			
			count = billsDue / 1;
			System.out.println("change is " + count + " $1 Dollar bills");
			billsDue %= 1;
			
			
			// amount due minus the whole number amount
			
			coinsDue = (totalchangeDue + 0.005) - (int)totalchangeDue;
			coinsDue *= 100;
			
			count = (int)coinsDue / 25;
			System.out.println("change is " + count + " Quarters");
			coinsDue %= 25;
			
			count = (int)coinsDue / 10;
			System.out.println("change is " + count + " Dimes");
			coinsDue %= 10;
			
			count = (int)coinsDue / 5;
			System.out.println("change is " + count + " Nickles");
			coinsDue %= 5;
			
			count = (int)coinsDue / 1;
			System.out.println("change is " + count + " Pennies");
			coinsDue %= 1;
			
		} while (true);
		


	} // end of main

} // end of class
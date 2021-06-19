//main class is Index
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Screen {
	
	public String promptWelcomePage(Scanner sc, String companyName) {
		System.out.println("------------------------------");
		System.out.println("Welcome to " + companyName);
		System.out.println("------------------------------");

		System.out.println("\n1. Continue without Login");
		System.out.println("2. Login");
		System.out.println("3. Exit");

		System.out.println("\nEnter your option: ");
		String option = sc.next();
		return option;
	}

	//input username
	public String promptMemberId(Scanner sc) {
		System.out.println("\nUsername: ");
		String username = sc.next();
		return username;
	}

	// input password
	public String promptPassword(Scanner sc) {
		System.out.println("Password: ");
		String password = sc.next();
		return password;
	}

	// if incorrect username or password
	public void displayIdOrPasswordNotFound() {
		System.out.println("\nError: Invalid username or password");
	}

	//search for bus
	public String promptSearchBusPage1(Scanner sc) {
		
		System.out.println("\n---------------");
		System.out.println("Search for Bus");
		System.out.println("---------------");
		System.out.println("\nSelect trip type:");
		System.out.println("1. One Way");
		System.out.println("2. Round Trip");
		System.out.println("3. Exit");

		System.out.println("\nEnter your option: ");
		String option = sc.next();
		return option;
	}

	//input departure city
	public String promptSearchBusTripPage2(Scanner sc) {
		System.out.println("\n---------------");
		System.out.println("DEPARTURE CITY");
		System.out.println("---------------");
		System.out.println();
		System.out.println("Penang");
		System.out.println("Melaka");
		System.out.println("Johor");
		System.out.println("K.Lumpur");
		System.out.println("N.Sembilan");
		System.out.println();
		System.out.println("Please enter name of DEPARTURE city:");
		String option = sc.next();
		return option;

	}

	//input arrival city
	public String promptSearchBusTripPage3(Scanner sc) {
		System.out.println("\n---------------");
		System.out.println("ARRIVAL CITY");
		System.out.println("---------------");
		System.out.println();
		System.out.println("Penang");
		System.out.println("Melaka");
		System.out.println("Johor");
		System.out.println("K.Lumpur");
		System.out.println("N.Sembilan");
		System.out.println();
		System.out.println("Please enter name of ARRIVAL city:");
		String option = sc.next();
		return option;

	}

	//input passenger's information
	public String requestName(Scanner sc) {
		System.out.println("\n----------------------");
		System.out.println("PASSENGER INFORMATION");
		System.out.println("----------------------");
		System.out.println();
		System.out.println("Passenger name:");
		String name = sc.next();
		return name;
	}

	public String requestContact(Scanner sc) {
		System.out.println();
		System.out.println("Passenger contact number:");
		String contact = sc.next();
		return contact;
	}

	//input seat ID
	public void selectSeatPage() {
		System.out.println("Insert Seat ID:");
	}

	//checkout
	public String promptCheckoutOrRepeat(Scanner sc) {
		System.out.println("\nProceed to Checkout:");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("3. Exit");

		System.out.println("\nEnter your option: ");
		String option = sc.next();
		return option;
	}

	//if no trip available
	public void tripNotFound() {
		System.out.println("\nError: Trip not Found.");
	}

	
	public void displayUnderConstructionPage() {
		System.out.println("\nSorry, this feature is under maintenance.");
	}

	//if input other than shown option
	public void displayInvalidOption() {
		System.out.println("\nError: Invalid option.");
	}

	public void displayGoodByePage(String name) {
		System.out.println("\nThank you. Have a good day!" + name);
	}

	public void displayGoodByePage() {
		System.out.println("\nThank you. Have a good day!");
	}

	//if no available trips
	public void noSeatTrip() {
		System.out.println("Sorry, no available trips.");
	}

	//successful login
	public void successLogin(String member) {
		System.out.println();
		System.out.println("You have succesfully logged in, " + member + ".");
	}

	//payment
	public String selectPaymentMethod(Scanner sc) {
		System.out.println("-------");
		System.out.println("PAYMENT");
		System.out.println("-------");
		System.out.println();
		System.out.println("1. Debit card");
		System.out.println("2. Credit card");
		System.out.println();
		System.out.println("Select payment method:");
		
		String option = sc.next();
		return option;
		
	}

	//if payment is successful
	public void transactionSuccesful() {
		System.out.println();
		System.out.println("Payment successful!");
	}
	
}

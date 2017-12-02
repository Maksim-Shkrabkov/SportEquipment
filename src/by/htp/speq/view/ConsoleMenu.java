package by.htp.speq.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleMenu {
	
	public static void printMenu() {
		System.out.println("1. View catalog");
		System.out.println("2. Do smth!");
		System.out.println("3. View rent catalog");
	}

	public static int readUserInput() throws IOException {
		hr();
		System.out.println("You must input variant of action: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		return convertInputStream(input);
	}
	
	private static int convertInputStream(String input) {
		int value = Integer.parseInt(input);
		return value;		
	}
	
	//methods for changing files
	
	public static int askWhatItemDoYouWantRent() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What item number do you want to rent: ");
		int number = in.nextInt();
		
		return number;
	}
	
	public static void printAssistantMenu() {
		hr();
		System.out.println("1. Show default catalog");
		System.out.println("2. Greeting");
		System.out.println("3. Add client");
		System.out.println("4. Get check of client");
		hr();
	}
	
	public static void printClientMenu() {
		hr();
		System.out.println("1. Get check");
		System.out.println("2. Show rented rentUnis");
		System.out.println("3. Add rentUnit");
		System.out.println("4. Remove rentUnit");
		System.out.println("5. Show cost of equipment");
		hr();
	}
	
	public static void hr() {
		System.out.println("----------");
	}
	

}

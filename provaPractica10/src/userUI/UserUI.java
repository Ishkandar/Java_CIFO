package userUI;

import controller.*;
import java.util.Scanner;

public class UserUI {
	// private class fields:
	private Scanner scan;
	private Controller controller;
	private ErrorMessages errMsg;
	
	// public custom constructor:
	public UserUI() {
		this.scan = new Scanner(System.in);
		this.controller = new Controller();
		this.errMsg = new ErrorMessages();
	}
	
	// it starts a user input stream, the commands entered
	// are formatted first and then checked for validity,
	// then each option is managed:
	public void UserAppDialog() {
		while (true) {
			System.out.println("Command: (type \"commands\" for help).\n"
					+ "--------------------------------------------\n");
			String command = scan.nextLine();
				
			switch (command) {
				case "":
					this.errMsg.getErrorMessage(4);
					break;
			
				case "add":
					System.out.print("Name: ");
					String name = scan.nextLine();
					System.out.print("Latin Name: ");
					String latinName = scan.nextLine();
					System.out.println();
					this.controller.add(name, latinName);
					break;
					
				case "observation":
					System.out.print("What was observed? ");
					String birdObserved = scan.nextLine();
					System.out.println();
					this.controller.Observation(birdObserved);
					break;
					
				case "statistics":
					System.out.println();
					this.controller.Statistics();
					break;
					
				case "show":
					System.out.print("What? ");
					String whatBird = scan.nextLine();
					System.out.println();
					this.controller.Show(whatBird);
					break;
					
				case "commands":
					System.out.println("Add - adds a new bird to the collection (discards duplicates) \n"
							+ "Observation - register one observation upon the given bird.\n"
							+ "Statistics - shows detailed info about every bird in the collection.\n"
							+ "Show - shows detailed info about the given bird.\n"
							+ "Commands - shows this help menu.\n"
							+ "Quit - exits the program.\n");
					break;
					
				case "quit":
					System.out.println();
					System.out.println("Thank you, good bye!");
					this.controller.Quit();
					break;
					
				default:
					break;
			}
		}
	}
}

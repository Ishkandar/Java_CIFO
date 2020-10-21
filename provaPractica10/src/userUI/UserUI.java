package userUI;

import controller.*;
import java.util.Scanner;

public class UserUI {
	// the user can: add, observation, statistics, show, quit
	private Scanner scan;
	private Controller controller;
	
	public UserUI() {
		this.scan = new Scanner(System.in);
		this.controller = new Controller();
	}
	
	public void UserAppDialog() {
		while (true) {
			System.out.print("? ");
			String command = scan.nextLine();

			switch (command) {
				case "add":
					System.out.print("Name: ");
					String name = scan.nextLine();
					System.out.print("Latin Name: ");
					String latinName = scan.nextLine();
					this.controller.add(name, latinName);
					break;
				case "observation":
					System.out.print("What was observed? ");
					String birdObserved = scan.nextLine();
					this.controller.Observation(birdObserved);
					break;
				case "statistics":
					this.controller.Statistics();
					break;
				case "show":
					System.out.print("What? ");
					String whatBird = scan.nextLine();
					this.controller.Show(whatBird);
					break;
				case "quit":
					System.out.println("Thank you, good bye!");
					this.controller.Quit();
					break;
				default:
					System.out.println("Command not found, try again.");
					break;
			}
		}
	}
}

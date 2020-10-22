package userUI;

public class StringUtilities {
	// cleans the user input for better usage experience:
	public static String formatUserInput(String userInput) {
		userInput = userInput.trim().toLowerCase();
		return userInput;
	}
	
	// checks whether the command entered 
	// by the user is valid or not:
	public static boolean commandAccepted(String command) {
		if (command.equals("add") || 
				command.equals("observation") || 
				command.equals("statistics") || 
				command.equals("show") || 
				command.equals("commands") ||
				command.equals("quit")) {
			return true;
		}
		System.out.println("Command not found, try again.");
		return false;
	}
}

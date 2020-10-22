package userUI;

public class StringUtilities {
	public static String formatUserInput(String userInput) {
		userInput = userInput.trim().toLowerCase();
		return userInput;
	}
	
	public static boolean commandAccepted(String command) {
		if (command.equals("add") || 
				command.equals("observation") || 
				command.equals("statistics") || 
				command.equals("show") || 
				command.equals("quit")) {
			return true;
		}
		System.out.println("Command not found, try again.");
		return false;
	}
}

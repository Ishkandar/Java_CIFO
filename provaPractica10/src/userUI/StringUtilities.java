package userUI;

public class StringUtilities {
	// cleans the user input for better usage experience:
	public static String formatUserInput(String userInput) {
		userInput = userInput.trim().toLowerCase();
		return userInput;
	}
}

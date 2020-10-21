package userUI;

public class StringUtilities {
	private String userInput;
	
	public StringUtilities() {
		this.userInput = null;
	}
	
	public String formatUserInput(String userInput) {
		this.userInput = userInput.trim().toLowerCase();
		return this.userInput;
	}
	
	public boolean commandAccepted(String command) {
		return true;
	}
}

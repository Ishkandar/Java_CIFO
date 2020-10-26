package userUI;

import java.util.*;

public class ErrorMessages {
	private HashMap<Integer, String> errorDict;
	
	public ErrorMessages() {
		this.errorDict = new HashMap<>();
		this.setErrorMessages();
	}
	
	public void setErrorMessages() {
		this.errorDict.put(0, "Bird not found.\n");
		this.errorDict.put(1, "Bird not added, already in the list.\n");
		this.errorDict.put(2, "The list is empty.\n");
		this.errorDict.put(3, "Command not found.\n");
		this.errorDict.put(4, "Please do not enter an empty line.\n");
	}
	
	public void getErrorMessage(int errCode) {
		System.out.println(this.errorDict.get(errCode));
	}
}

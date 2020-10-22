package userUI;

import java.util.*;

public class ErrorMessages {
	private Hashtable<Integer, String> errorDict;
	
	public ErrorMessages() {
		this.setErrorMessages();
	}
	
	public void setErrorMessages() {
		this.errorDict.put(0, "Bird not found.");
		this.errorDict.put(1, "Bird not added, already in the list.");
		this.errorDict.put(2, "The list is empty.");
		this.errorDict.put(3, "Command not found.");
	}
	
	public void getErrorMessage(int errCode) {
		System.out.println(this.errorDict.get(errCode));
	}
}

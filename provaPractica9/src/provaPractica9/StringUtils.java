package provaPractica9;

public class StringUtils {
	
	public static boolean included(String word, String searched) {
		String formattedWord = word.trim().toLowerCase();
		String formattedSearched = searched.trim().toLowerCase();
		
		return (formattedSearched.contains(formattedWord)) ? true : false;
	}
}

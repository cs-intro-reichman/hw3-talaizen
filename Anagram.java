/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		// System.out.println(isAnagram("silent","listen"));  // true
		// System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		// System.out.println(isAnagram("Madam Curie","Radium came")); // true
		// System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// // Tests the preProcess function.
		// System.out.println(preProcess("What? No way!!!"));
		
		// // Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		// String str = "1234567";
		// Boolean pass = true;
		// //// 10 can be changed to much larger values, like 1000
		// for (int i = 0; i < 10; i++) {
		// 	String randomAnagram = randomAnagram(str);
		// 	System.out.println(randomAnagram);
		// 	pass = pass && isAnagram(str, randomAnagram);
		// 	if (!pass) break;
		// }
		// System.out.println(pass ? "test passed" : "test Failed");


		// System.out.println(isAnagram("William Shakespeare", "I am a weakish speller"));
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		str1 = preProcess(str1);
		str2 = preProcess(str2);
		if (str1.length() != str2.length()) return false;

		for (int i = 0; i < str1.length(); i++){
			char current_char = str1.charAt(i);
			int ascii_value = (int) current_char;
			int ascii_counter_1 = 0;
			int ascii_counter_2 = 0;
			for (int j = 0; j < str1.length(); j++){
				if ((int) str1.charAt(j) == ascii_value) ascii_counter_1++;
				if ((int) str2.charAt(j) == ascii_value) ascii_counter_2++;
			}
			if (ascii_counter_1 != ascii_counter_2) return false;		
			
		}  
		return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		// Replace the following statement with your code
		String finalWord = "";
		int spaceCounter = 0;
		for (int i = 0; i < str.length(); i ++){
			char current_char = str.charAt(i);
			int ascii_value = (int) current_char;
			if ((spaceCounter < 1) && (ascii_value == 32)){
				finalWord += current_char;
				spaceCounter ++;
			}
			if (ascii_value >= 97 && ascii_value <= 122) finalWord += current_char;
			if (ascii_value >= 65 && ascii_value <= 90) finalWord += (char) (ascii_value + 32);
		}
		return finalWord;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		// String randAn = "";
		// int strLength = str.length();
		// for (int i = 0; i < strLength; i++){
		// 	int randomIndex = (int) (Math.random() * str.length());
		// 	randAn += str.charAt(randomIndex);
		// 	if (randomIndex == str.length()) str = str.substring(0, randomIndex);
		// 	else str = str.substring(0, randomIndex) + str.substring(randomIndex + 1);
		// }
		// return randAn;
		String randAn = "";
		while (str.length() > 0) {
			String partialStr = "";
			int index = (int) (Math.random() * str.length());
			randAn += str.charAt(index);
			for(int i = 0; i < str.length(); i++){
				if (i != index) partialStr += str.charAt(i);
			}
			str = partialStr;
		}
		return randAn;
	}
}

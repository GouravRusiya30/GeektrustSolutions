package com.gourav.kingdom.king;

public class SecretMessageChecker {
	
	/**
	 * Tests whether the secret message contain the letters of the animal in their emblem
	 * @param message
	 * @param emblem
	 * @return
	 */
	public boolean messageCheck(String message, String emblem){
		boolean check = true;
		
		char [] emblemCount = characterCount(emblem);
		char [] messageCount = characterCount(message);
		
		int i=0;
		
		for(i=0;i<26;i++){
			if(!(messageCount[i] >= emblemCount[i]))
				break;
		}
		
		if(i<26)
			check=false;
		
		return check;
	}
	
	
	
	/**
	 * Efficient method that provides count of characters in a String
	 * 
	 * Time Complexity - O(n)
	 * Space Complexity - O(1)
	 * @param message
	 * @return
	 */
	public char [] characterCount(String message){
		
		message = message.replaceAll(" ", "");
		message = message.toLowerCase().trim();
		
		char [] charCount = new char[26];
		
		for(int i=0;i<message.length();i++){
			if(message.charAt(i) >='a' && message.charAt(i) <= 'z')
				charCount[message.charAt(i)-'a']++;
		}
		
		return charCount;
	}
	
}

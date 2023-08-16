package com.test.java;

import java.security.SecureRandom;

public class Password {
	public static void main(String[] args) {
		
	        SecureRandom rnd = new SecureRandom();
	        int minLength = 8;
	        int maxLength = 12;

	        String password = generateRandomPassword(rnd, minLength, maxLength);
	        System.out.println("Generated Password: " + password);
	    }

	    public static String generateRandomPassword(SecureRandom rnd, int minLength, int maxLength) {
	        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String allCharacters = lowerCase + upperCase;

	        int passwordLength = rnd.nextInt(maxLength - minLength + 1) + minLength;

	        StringBuilder passwordBuilder = new StringBuilder(passwordLength);
	        for (int i = 0; i < passwordLength; i++) {
	            int randomIndex = rnd.nextInt(allCharacters.length());
	            char randomChar = allCharacters.charAt(randomIndex);
	            passwordBuilder.append(randomChar);
	        }

	        return passwordBuilder.toString();
	    }
	}//main



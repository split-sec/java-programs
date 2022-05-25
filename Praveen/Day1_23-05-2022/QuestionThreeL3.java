/**
	@author Praveenkumar Senthilkumar
	Date : 23-05-2022
	Question : 3
		Logic : 1
			Input: ['1', '15', '35', '4', '20', '18']
			Output: ['1', '4', '15', '18', '20', '35']
			
*/

public class QuestionThreeL3 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// Gets Input
		String input = sc.nextLine();
		int n = input.length();
		
		// To Store Digits
		java.util.ArrayList<String> array = new java.util.ArrayList<>();
		
		// Seperating Digits 
		String number = "";
		for (int i = 2; i < n; i++) {
			
			// For Negative Numbers
			if (input.charAt(i) == '-') {
				i++;
				if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
					while (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
						number += input.charAt(i);
						i++;
					}
					array.add("-" + number);
					number = "";
				}
			}
			
			// For Positive Numbers
			else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				while (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
					number += input.charAt(i);
					i++;
				}
				array.add(number);
				number = "";
			}
		}
		
		
		int len = array.size();
		
		// Store in Normal Array
		String[] arr = new String[len];
		int index = 0;
		
		for(String s : array) {
			arr[index] = s;
			index++;
		}
		
		// Sorts Digit Strings
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if(Compare(arr[j], arr[i])) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		// Prints String Array
		System.out.print("[");
		for (int i = 0; i < len; i++) { 
			if (i == (len-1)) System.out.print("'" + arr[i] + "'");
			else System.out.print("'" + arr[i] + "', ");
		}
		System.out.print("]");
	}
	
	
	/* Compare the String in char by char */
	public static boolean Compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(s1.charAt(0) == '-' || s2.charAt(0) == '-') {
			if (len1-1 < len2-1) {
				return true;
			} else if (len1-1 > len2-1) {
				return false;
			} else if(s1.charAt(0) == '-' && s2.charAt(0) != '-') {
				return true;
			} else if (s1.charAt(0) != '-' && s2.charAt(0) == '-') {
				return false;
			}else {
				int flag = 0;
				for(int i = 1; i < len1; i++) {
					if(s1.charAt(i) < s2.charAt(i)) {
						return true;
					} else if (s1.charAt(i) > s2.charAt(i)) {
						return false;
					} 
				}
				return false;
			}
		}else {
			if (len1 < len2) {
				return true;
			} else if (len1 > len2) {
				return false;
			} else {
				int flag = 0;
				for(int i = 0; i < len1; i++) {
					if(s1.charAt(i) < s2.charAt(i)) {
						return true;
					} else if (s1.charAt(i) > s2.charAt(i)) {
						return false;
					} 
				}
				return false;
			}
		}
		
		
	}
}
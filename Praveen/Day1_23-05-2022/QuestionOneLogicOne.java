/**
 Question 1:
	Input: 12345*-++
	Output: 8
	
	1*2
		2-3
			-1+4
				3+5
					8

*/

// Logic 1

import java.util.Scanner;

public class QuestionOneLogicOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int i = 0;
		int j = 0;
		int n = input.length();
		
		// find operator
		for (; j < n; j++) {
			if (!(input.charAt(j) >= '0' && input.charAt(j) <= '9')) break;
		}
		
		int a = input.charAt(i) - '0';
		int b = 0;
		int limit = j;
		
		for (i = 1; i < limit; i++) {
			char operator = input.charAt(j++);
			b = input.charAt(i) - '0';
			a = operate(a, b, operator);
		}
		
		System.out.println(a);
	}
	
	public static int operate(int a, int b, char operator) {
		if (operator == '/') return a / b;
		else if (operator == '*') return a * b;
		else if (operator == '+') return a + b;
		else return a - b;
	}
}
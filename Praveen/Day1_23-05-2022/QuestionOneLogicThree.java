/**
	Question 1:
		Logic 3:
		
			Input : 12345*+-+
			Output: 6
*/

import java.util.Scanner;

public class QuestionOneLogicThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input = sc.nextLine();
	
		char[] array = input.toCharArray();
	
		int n = array.length;
	
		int j = (n / 2) + 1;
	
		int a = array[0] - '0';
	
		for (int i = 1; j < n; i++) {
			a = operate(a, array[i] - '0', array[j++]); 
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
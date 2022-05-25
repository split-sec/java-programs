/**
	Question 1:
		Logic 2:
		
			Input : 12345*-++
			Output: 8
			
*/

import java.util.Scanner;

public class QuestionOneLogicTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input = sc.nextLine();
		
		int n = input.length();
		int limit = (n / 2) + 1;
		
		int[] queue = new int[limit];
		int front = 0;
		int rear = 0;
		
		int a = input.charAt(front) - '0';
		int b = 0;
		char operator = 0;
		
		for (int i = 1; i < n; i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				queue[rear++] = input.charAt(i) - '0';
			} else {
				b = queue[front++];
				operator = input.charAt(i);
				System.out.println(a);
				System.out.println(b);
				System.out.println(operator);
				a = operate(a, b, operator);
			}
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
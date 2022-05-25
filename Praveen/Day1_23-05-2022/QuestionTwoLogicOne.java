/**
	Question 2:
		Input : 2, 5, 7
		Output: 5, 7, -1
*/

public class QuestionTwoLogicOne {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		int n = input.length;
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(input[i]);
		}
		
		int[] ans = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			int digit = array[i];
			int max = Integer.MAX_VALUE;
			
			for (int j = i+1; j < n; j++) {
				if (array[j] > digit && array[j] < max) {
					max = array[j];
				}
			}
			
			if (max == Integer.MAX_VALUE) {
				ans[i] = -1;
			} else {
				ans[i] = max;
			}
			
		}
		
		for (int i = 0; i < n; i++) { 
			if (i == (n-1)) System.out.print(ans[i]);
			else System.out.print(ans[i] + ",");
		}
	}
}
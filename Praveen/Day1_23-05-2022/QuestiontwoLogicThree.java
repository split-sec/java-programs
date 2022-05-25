/**
	Question 2:
		Logic 3:
		
			Input: 2,5,7
			Output: 5,7,-1
*/

public class QuestiontwoLogicThree {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String[] input = sc.nextLine().split(",");
		int n = input.length;
		
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		
		int index = 0;
		for (String s : input) {
			array1[index] = Integer.parseInt(s);
			array2[index] = Integer.parseInt(s);
			index++;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if(array2[j] < array2[i]) {
					int temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
		}
		
		int[] ans = new int[n];
		int i =0;
		
		for (; i < n-1; i++) {
			if (array2[i+1] > array1[i]) {
				int flag = 0;
				for(int j = i+1; j < n; j++) {
					if(array2[i+1] == array1[j]) {
						ans[i] = array2[i+1];
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					ans[i] = -1;
				}
				
			} else {
				int x = i+1+1;
				int y = i;
				int flag = 0;
				while (x < n) {
					if(array2[x] > array1[y]) {
						ans[i] = array2[x];
						flag = 1;
						break;
					}
					x++;
				}		
				if (flag == 0) ans[i] = -1;
			} 
		}
	
		ans[n-1] = -1;
		
		for (i = 0; i < n; i++) { 
			if (i == (n-1)) System.out.print(ans[i]);
			else System.out.print(ans[i] + ",");
		}
	}
}
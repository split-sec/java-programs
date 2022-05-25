public class AlternateSort {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) array[i] = scanner.nextInt();
		
		/*
		// java.util.Arrays.sort(array);
		 array = mySort(array);
		
		int min = Integer.MIN_VALUE;
		int nextMin = 0;
		
		for(int i = 0, j = n - 1; i < n; i++) {
			
			if(i % 2 == 0) {
				if(min == Integer.MIN_VALUE) min = array[i];
				else nextMin = array[i];
				
				array[i] = array[j];
				j--;
			}else {
				int temp = array[i];
				array[i] = min;
				min = nextMin;
				nextMin = temp;
			}
			
		}
		array[n-1] = nextMin;
		*/
		/*
		// With Sorting
		for(int i = 0; i < n-1; i+= 2) {
			int temp = array[i];
			array[i] = array[n-1];
			for(int index = n-2; index > i; index--) {
				array[index+1] = array[index];
			}
			array[i+1] = temp;
		}
		*/
		
		/*
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n-1; i += 2) {
			// int[] minMaxPos = maxAndMin(array, n, i);
			// int maxi = minMaxPos[0];
			// int mini = minMaxPos[1];
			
			for(int k = 0; k < n; k++) {
				System.out.print(array[k] + " ");
			}System.out.println();
			System.out.println();
			
			int maxi = 0;
			int mini = 0; 
		
			for(int j = i; j < n; j++) {
				if(array[j] > max) {
					max = array[j];
					maxi = j;
				}
				if(array[j] < min) {
					min = array[j];
					mini = j;
				}
			}
			System.out.println(maxi + " " + mini);
		
			int temp1 = array[i];
			int temp2 = array[i+1];
			array[i] = array[maxi];
			if(i == mini) array[i+1] = temp1;
			else array[i+1] = array[mini];
			array[maxi] = temp1;
			array[mini] = temp2;
			
			for(int k = 0; k < n; k++) {
				System.out.print(array[k] + " ");
			}System.out.println();
			System.out.println();
			
			
		}
		*/
		
		
		// Without Sorting
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(i % 2 == 0) {
					if(array[j] > array[i]){
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					} else {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}System.out.println();
	}
	
	public static int[] maxAndMin(int[] array, int n, int index) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxi = 0;
		int mini = 0; 
		
		for(int i = index; i < n; i++) {
			if(array[i] >= max) {
				max = array[i];
				maxi = i;
			}
			if(array[i] <= min) {
				min = array[i];
				mini = i;
			}
		}
		
		int[] maxMinPos = new int[2];
		maxMinPos[0] = maxi;
		maxMinPos[1] = mini;
		
		return maxMinPos;
	}
	
	public static int[] mySort(int[] array) {
		int n = array.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
}
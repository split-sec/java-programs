import java.util.Scanner;

public class alt {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int i, j, k;

    int matrix_size = (size*2)-1;

    //generating a matrix
    int[][] array = new int[matrix_size][matrix_size];

    //initializing the matrix
    for(i = 0; i < matrix_size; i++) {
      for(j = 0; j < matrix_size; j++)
        array[i][j] = size;
    }

    //manipulating the matrix_size
    for(i = 1; i < matrix_size; i++) {
      for(j = i; j < matrix_size-i; j++) {
        for(k = i; k < matrix_size-i; k++) {
            array[j][k]--;
        }
      }
    }

    //printing the matrix
    for(i = 0; i < matrix_size; i++) {
      for(j = 0; j < matrix_size; j++)
        System.out.print(array[i][j] + " ");
      System.out.println();
    }
  }
}

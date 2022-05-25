import java.util.Scanner;

public class question2v3 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] array = new int[size];
    for(int i = 0; i < size; i++)
      array[i] = scan.nextInt();

    int temp;
    for(int i = 0; i < size-1; i += 2) {

      for(int j = i; j < size; j++) {
        if(array[j] > array[i]) {
          temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }

        if(array[j] < array[i+1]) {
          temp = array[j];
          array[j] = array[i+1];
          array[i+1] = temp;
        }
      }

    }

    for(int i = 0; i < size; i++)
      System.out.print(array[i] + " ");

  }
}

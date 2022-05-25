import java.util.Scanner;

public class question2 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] array = new int[size];
    for(int i = 0; i < size; i++)
      array[i] = scan.nextInt();

    int temp;
    for(int i = 0; i < size-1; i++) {
      for(int j = i; j < size; j++) {
        if(array[i] < array[j]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }

    for(int i = 1; i < size; i += 2) {
      temp = array[size-1];
      for(int j = size-2; j >= i; j--){
        array[j+1] = array[j];
      }
      array[i] = temp;
    }

    for(int i = 0; i < size; i++)
      System.out.print(array[i] + " ");

  }
}

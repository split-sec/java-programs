import java.util.Scanner;

public class question2v2 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] array = new int[size];
    for(int i = 0; i < size; i++)
      array[i] = scan.nextInt();


    int temp;
    int biggest = 0;
    int smallest = 1;
    for(int i = 1; i < size; i += 2) {

      for(int j = i; j < size; j++) {
        if(array[j] > array[biggest])
          biggest = j;
      }
      temp = array[i-1];
      array[i-1] = array[biggest];
      array[biggest] = temp;

      for(int j = i; j < size; j++) {
        if(array[j] < array[smallest])
          smallest = j;
      }
      temp = array[i];
      array[i] = array[smallest];
      array[smallest] = temp;

      biggest = i+1;
      smallest = i+2;

    }

    for(int i = 0; i < size; i++)
      System.out.print(array[i] + " ");

  }
}

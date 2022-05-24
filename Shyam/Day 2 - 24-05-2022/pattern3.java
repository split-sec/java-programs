import java.util.Scanner;

public class pattern3 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    for(int i = 0; i < size; i++) {
      for(int j = size-i; j <= size; j++)
        System.out.print(j + " ");
      for(int k = 0; k < size-i-1; k++)
        System.out.print(size + " ");
      System.out.println();
    }
  }
}

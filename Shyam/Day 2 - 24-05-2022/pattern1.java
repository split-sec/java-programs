import java.util.Scanner;

public class pattern1 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    for(int i = 1; i <= size; i++) {
      for(int j = 1; j <= i; j++)
        System.out.print(i + " ");
      System.out.println();
    }
  }
}

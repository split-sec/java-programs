import java.util.Scanner;

public class pattern2 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    for(int i = 1; i <= size; i++) {
      for(int j = i; j >= 1; j--)
        System.out.print(j + " ");
      System.out.println();
    }
  }
}

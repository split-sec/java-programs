import java.util.Scanner;

public class pattern4 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        if(i == 0 || i == size-1 || j == 0 || j == size-1)
          System.out.print("1 ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}

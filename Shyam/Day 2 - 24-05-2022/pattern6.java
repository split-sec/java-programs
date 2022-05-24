import java.util.Scanner;

public class pattern6 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int count = 1;
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        if(j >= size-i-1 && j < size) {
          System.out.print(count);
          System.out.print("\t");
          count++;
        }
        else
          System.out.print("\t");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println();

    count = 1;
    for(int i = 0; i < size; i++) {
      for(int j = size-1; j > i; j--)
        System.out.print("\t");
      for(int j = size-i; j <= size; j++) {
        System.out.print(count);
        System.out.print("\t");
        count++;
      }
      System.out.println();
    }
  }
}

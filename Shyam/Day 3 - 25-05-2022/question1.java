import java.util.Scanner;

public class question1 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int count = 1, sign = 1;
    for(int i = 0; i < size; i++, System.out.println()) {

      //to determine the flow (forward or backward)
      //sign = -1 + (2*((i+1)%2));

      //for printing whitespace
      for(int k = size-1-i; k > 0; k--)
        System.out.print("\t");

      //for printing pattern
      for(int k = 0; k < size; k++) {
        System.out.print(count + "\t");
        count += sign;
      }

      //simpler method
      count += size-sign;
      sign *= -1;

    }

  }
}

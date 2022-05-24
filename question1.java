import java.util.Scanner;

public class question1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //String input
    String s = sc.next();
    int len = s.length();
    int i, j, a, b;
    //Converting to charArray
    char[] charray = s.toCharArray();
    a = charray[0] - '0';

    //Calculation part
    for(i=1, j=(len/2)+1; i<=len/2; i++, j++) {
      b = charray[i] - '0';
      switch(charray[j]) {
        case '+':
          a += b;
          break;

        case '-':
          a -= b;
          break;

        case '*':
          a *= b;
          break;

        case '/':
          a /= b;
          break;
      }
    }

    //Printing output
    System.out.println(a);
  }
}

import java.util.*;
import java.lang.*;

public class question3 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int len = scan.nextInt();
    int i, j, k;
    String[] sarray = new String[len];
    for(i=0; i<len; i++)
      sarray[i] = scan.next();

    Arrays.sort(sarray);
    for(i=0; i<len; i++)
      System.out.print(sarray[i] + " ");
    System.out.println();

    String temp;
    for(j=0; j<len-1; j++) {
      for(i=0; i<len-1; i++) {
        if(sarray[i+1].length() < sarray[i].length()) {
          temp = sarray[i];
          sarray[i] = sarray[i+1];
          sarray[i+1] = temp;
        }
      }
    }

    // String temp;
    // for(i=0; i<len-1; i++) {
    //   for(j=i; j<len; j++) {
    //     if(sarray[j].length() < sarray[i].length()) {
    //       temp = sarray[j];
    //       for(k=j; k>=i+1; k--)
    //         sarray[k] = sarray[k-1];
    //       sarray[i] = temp;
    //     }
    //   }
    // }

    for(i=0; i<len; i++)
      System.out.print(sarray[i] + " ");
  }
}

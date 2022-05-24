import java.util.Scanner;

public class question2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int i, j, min = -1;
    //Array input
    for(i=0; i<n; i++)
      a[i] = sc.nextInt();

    for(i=0; i<n-1; i++) {

      min = -1;
      for(j=i+1; j<n; j++) {
        //Making sure a[j] is greater than a[i]
        if(a[j] > a[i]) {
          //Checking if min is -1
          if(min == -1 && a[j] > min) {
            min = a[j];
            continue;
          }

          if(a[j]<min)
              min = a[j];

        }
      }

      //Checking if still -1 is the minimum
      if(min > a[i])
        a[i] = min;
      else
        a[i] = -1;

    }
    a[n-1] = -1;

    //Output
    for(i=0; i<n; i++)
      System.out.print(a[i] + " ");
  }
}

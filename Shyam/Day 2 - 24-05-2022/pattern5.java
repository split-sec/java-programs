import java.util.Scanner;

public class pattern5 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();

    int matrix_size = (size*2)-1;

    //first horizontal half of pattern
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < matrix_size; j++) {

        //checking whether middle pattern or not
        //not a middle pattern goes into if
        if(j < i || j > matrix_size-1-i) {

          //left part
          if(j < ((matrix_size/2)+1))
            System.out.print(size-j + " ");

          //right part
          else
            System.out.print(size - (matrix_size-1-j) + " ");

        }

        //middle pattern
        else
          System.out.print(size-i + " ");
      }
      System.out.println();
    }

    //second horizontal half of pattern
    for(int i = size-2; i >= 0; i--) {
      for(int j = 0; j < matrix_size; j++) {

        //checking whether middle pattern or not
        //not a middle pattern goes into if
        if(j < i || j > matrix_size-1-i) {

          //left part
          if(j < ((matrix_size/2)+1))
            System.out.print(size-j + " ");

          //right part
          else
            System.out.print(size - (matrix_size-1-j) + " ");

        }

        //middle pattern
        else
          System.out.print(size-i + " ");
      }
      System.out.println();
    }
  }
}

import java.util.Scanner;

public class hw_question1v4 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String string_input = scan.next();
    int string_length = string_input.length();
    char[] char_array = string_input.toCharArray();

    int count;
    for(int i = 0; i < string_length; i++) {
      count = 1;
      if(char_array[i] == '\0')
        continue;
      for(int j = i+1; j < string_length; j++) {
        if(char_array[i] == char_array[j]) {
          count++;
          char_array[j] = '\0';
        }
      }
      System.out.println(char_array[i] + " " + count);
    }

  }
}

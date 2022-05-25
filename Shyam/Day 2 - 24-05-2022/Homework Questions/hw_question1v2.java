import java.util.Scanner;

public class hw_question1v2 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String string_input = scan.next();
    int string_length = string_input.length();
    char[] char_array = string_input.toCharArray();
    char[] non_duplicates = new char[string_length] ;
    int count = 1, flag, char_count;
    non_duplicates[0] = char_array[0];
    for(int i = 1; i < string_length; i++) {
      flag = -1;
      for(int j = 0; j < count; j++) {
        if(char_array[i] == non_duplicates[j]) {
          flag = 0;
          break;
        }
      }
      if(flag == -1) {
        non_duplicates[count++] = char_array[i];
      }
    }

    for(int i = 0; i < count; i++) {
      char_count = 0;
      for(int j = 0; j < string_length; j++) {
        if(non_duplicates[i] == char_array[j])
          char_count++;
      }
      System.out.println(non_duplicates[i] + " " + char_count);
    }

  }
}

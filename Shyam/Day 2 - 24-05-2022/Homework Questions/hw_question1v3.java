import java.util.Scanner;

public class hw_question1v3 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String string_input = scan.next();
    int string_length = string_input.length();
    char[] char_array1 = string_input.toCharArray();
    char[] char_array2 = string_input.toCharArray();

    //manipulating second char_array
    int flag;
    for(int i = 0; i < string_length-1; i++) {
      for(int j = i+1; j < string_length; j++) {
        if(char_array1[i] == char_array2[j])
          char_array2[j] = '\0';
      }
    }

    //calculating count
    int count;
    for(int i = 0; i < string_length; i++) {
      count = 0;
      if(char_array2[i] == '\0')
        continue;
      for(int j = 0; j < string_length; j++) {
        if(char_array2[i] == char_array1[j])
          count++;
      }
      System.out.println(char_array2[i] + " " + count);
    }

  }
}

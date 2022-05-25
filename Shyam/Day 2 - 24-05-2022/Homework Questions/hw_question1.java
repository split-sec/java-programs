import java.util.Scanner;

public class hw_question1 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String string_input = scan.next();
    int string_length = string_input.length();
    char[] char_array = string_input.toCharArray();
    char temp;

    for(int i = 0; i < string_length-1; i++) {
      for(int j = 0; j < string_length-1; j++) {
        if(char_array[j] > char_array[j+1]) {
          temp = char_array[j];
          char_array[j] = char_array[j+1];
          char_array[j+1] = temp;
        }
      }
    }

    int count = 0;
    temp = '0';
    for(int i = 0; i < string_length; i++) {
      if(temp == '0') {
        temp = char_array[i];
        count++;
      }
      else {
        if(temp == char_array[i])
          count++;
        else {
          System.out.println(temp + " " + count);
          temp = char_array[i];
          count = 1;
        }
      }
      if(i == string_length-1)
        System.out.println(temp + " " + count);
    }

  }
}

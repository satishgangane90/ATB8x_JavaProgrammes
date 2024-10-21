package Oct.Task18102024;

import java.util.Scanner;

//reverse string


public class ReverseString {

    public static void main(String[] args) {


        String str;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");

            // Take string input from the user
             str = scanner.nextLine();

            char[] charArray=str.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {  // Start from length - 1
            System.out.print(charArray[i]);  // Print characters in reverse order
        }

    }







}

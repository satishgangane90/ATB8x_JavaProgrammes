package Oct.Task18102024;

import java.util.Scanner;

//palindrome string

public class Palindrome {

    public static void main(String[] args) {


        String str;

        String revstr="";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        // Take string input from the user
        str = scanner.nextLine();

        char[] charArray = str.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {// Start from length --- 1
            revstr += charArray[i];
        }

            if (revstr.equals(str)) {

                System.out.println("string is palindrome");
            } else {

                System.out.println("string is not palindrome");

            }
        }


    }

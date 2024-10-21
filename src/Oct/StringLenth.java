package Oct;

import java.util.Scanner;

public class StringLenth {

    String str;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        // Take string input from the user
        String str = scanner.nextLine();

        char[] charArray=str.toCharArray();

        int count = 0;

        // Use a loop to count the number of characters in the array
        for (int i=1;i<= charArray.length;i++) {
            count++; // Increment the counter for each character
        }


        System.out.println("The length of the character array is: " + count);
    }




        }












package sept.Task25092024;

import java.util.Scanner;

public class FactorialProgramme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

      int factorial =1;

      int i=1;

        while ( i <= number) {
            factorial *= i;  // Multiply factorial by i

            int fact = number*i;

            System.out.println(number+ " * "+i+"="+fact);

            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);


        }















    }


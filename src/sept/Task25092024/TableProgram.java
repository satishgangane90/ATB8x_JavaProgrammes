package sept.Task25092024;

import java.util.Scanner;

public class TableProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Numb = scanner.nextInt();

        int i =1;

        while(i<=10){

            System.out.println(Numb+ " * "+i+"="+(Numb * i));

            i++;



        }


    }
}

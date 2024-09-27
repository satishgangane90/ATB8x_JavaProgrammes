package sept.Task23092024;

import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("1. please select 1 for conversion type selection for m to Km or km to m  ");
        System.out.println("2. please select 2for  conversion type selection for f to c & c to f");
        int selection = scanner.nextInt();

        switch(selection){
            case 1: //selection of KM flow

                System.out.println("1: Kilometers to Miles");
                System.out.println("2: Miles to Kilometers");
                System.out.print("Enter your choice (1 or 2): ");
                int kmtomile = scanner.nextInt();
                if(kmtomile==1){

                    System.out.println("enter km");
                    double km =scanner.nextDouble();

                    double miles = km *0.621371;

                    System.out.println("Total miles on your entered Km :"+" "+miles);
                    
                } else if (kmtomile==2) {

                    System.out.println("enter mile");
                    double mile =scanner.nextDouble();

                    double km = mile / 0.621371;
                    System.out.println("Total KM on your entered mile :"+" "+km);

                }

                else

                    System.out.println("invalid input");
                break;
            case 2:  //selection of celsius flow

                System.out.println("1: Fahrenheit to Celsius");
                System.out.println("2: Celsius to Fahrenheit");
                System.out.print("Enter your choice (1 or 2): ");
                int ftoc = scanner.nextInt();
                if(ftoc==1){

                    System.out.println("enter fr");
                    double fr =scanner.nextDouble();
                    double cs = (fr - 32) * 5/9;

                    System.out.println("Total cs for your fr:"+" "+cs);

                } else if (ftoc==2) {

                    System.out.println("enter cs");
                    double cs =scanner.nextDouble();

                    double fr = (cs * 9/5) + 32;
                    System.out.println("Total fr for your cs :"+" "+fr);

                }

                else
                    System.out.println("invalid input ");
             break;
            default:
                System.out.println("invalid input");

                }





        }








    }






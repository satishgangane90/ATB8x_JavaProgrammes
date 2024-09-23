package sept.Task20092024;

public class Ternaryoperators {

    public static void main(String[] args) {


        int a=10;
        int b =20;
        int  c=45;

        int d = (a > b) ? a : b;  // created temp variable to hold highest value among 2

        int maxValue = (d > c) ? d : c; // comparing highest value among 2 with third int

        System.out.println("The maximum value is = "+ maxValue);





    }




}

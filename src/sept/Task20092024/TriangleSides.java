package sept.Task20092024;

public class TriangleSides {

    public static void main(String[] args) {

    int Aside = 60;
    int Bside =60;
    int Cside=60;

    if( (Aside == Bside) & (Bside == Cside) ){

        System.out.println( "the Tringle is equilateral");

        }

    else if ((Aside == Bside)  || (Bside == Cside) || (Aside ==Cside)){

        System.out.println( "the Triangle is isosceles");
    }

    else {
        System.out.println( "the Triangle is scalene");
    }


        }


}

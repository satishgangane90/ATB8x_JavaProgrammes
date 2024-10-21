package Oct.Task14102024;

public class PrintMyBookClass extends BookClass {


    public  PrintMyBookClass(String name, String author, int price) {
        super.getDetails(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(Name + "," + Author +","  + Price);


    }
}

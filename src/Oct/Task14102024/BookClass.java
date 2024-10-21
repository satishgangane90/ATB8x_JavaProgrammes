package Oct.Task14102024;

public abstract class BookClass {

    String Name;
    String Author;
    int Price;
    public void  getDetails(String name,String author,int price) {

        Name = name;
        Author = author;
        Price = price;
    }
        abstract void getDetails();
    }








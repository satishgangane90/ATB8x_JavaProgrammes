package Oct.Task14102024;

public class RunnableClass {

    public static void main(String [] args ){

        BookClass myBook = new PrintMyBookClass("Harry Potter", "J.k. Rowling", 120);//Dynamic Dispatch
        myBook.getDetails();
    }
}



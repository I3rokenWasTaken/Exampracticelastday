package ie.example1.oop.lastday;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;


    public void displayDetails()
    {
        System.out.println("Book title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book page count: " + pageCount);
        System.out.println("Book available: " + available);

    }

    public void borrowBook(){

        if (available) {
            available = false;
            System.out.println(title + " Has been Borrowed");
        }
        else {
            System.out.println(title + " is already on loan");
        }
    }
}

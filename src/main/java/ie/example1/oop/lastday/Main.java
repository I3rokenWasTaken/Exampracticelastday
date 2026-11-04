package ie.example1.oop.lastday;

public class Main {
    public static void main(String[] args){
        Book firstBook = new Book();
        firstBook.title = "Last day of Exam";
        firstBook.author = "Mohammad Tahsin Bhuyan";
        firstBook.pageCount = 415;

        // before Loan
        firstBook.displayDetails();
        firstBook.borrowBook();
        // after Loan
        firstBook.displayDetails();

        Book secondBook = createBook("First day of Result", "Tahmid", 321);
        Book thirdBook = createBook("Last day of Result", "Tayyibah", 49);
        Book fourthBook = createBook("Welcome to jobs", "Tanvir", 881);

        System.out.println("\n");
        secondBook.displayDetails();
        System.out.println("\n");
        thirdBook.displayDetails();
        System.out.println("\n");
        fourthBook.displayDetails();
    }

    private static Book createBook(String title, String author, int pageCount)
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;


    }
}

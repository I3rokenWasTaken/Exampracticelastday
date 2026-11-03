package ie.example1.oop.lastday;

public class Main {
    public static void main(String[] args){
        Book firstBook = new Book();
        firstBook.title = "Last day of Exam";
        firstBook.author = "Mohammad Tahsin Bhuyan";
        firstBook.pageCount = 415;

        firstBook.displayDetails();
        firstBook.borrowBook();
        firstBook.displayDetails();
    }
}

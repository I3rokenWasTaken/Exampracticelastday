package ie.example1.oop.lastday;

import java.util.ArrayList;
import java.util.List;
public class LibraryService
{
    private static final int MAX_LOAN_DAYS = 14;
    private final List <Book> books = new ArrayList<>();

    public void loanBook(Book book, int loandays){
        if (book == null){
            throw new IllegalArgumentException("Book cannot be null");
        }
        if (loandays < 1 || loandays > MAX_LOAN_DAYS){
            throw new IllegalArgumentException("Loan days must be between 1-14");
        }
        book.borrowBook();
    }

    public void addBook (Book book){
        if (book == null){
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    public int getBookCount(){
        return books.size();
    }

    public List <Book> getAllBooks(){
        return new ArrayList<>(books);
    }

    public Book findBookByTitle(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
}

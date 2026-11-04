package ie.example1.oop.lastday;

public class Book {
    private String title;
    private String author;
    private String pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPageCount() {
        return pageCount;
    }
}
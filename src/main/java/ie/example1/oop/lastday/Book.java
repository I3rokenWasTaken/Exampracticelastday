package ie.example1.oop.lastday;

public class Book {
    private final String title;
    private final String author;
    private final int pageCount;
    private BookStatus status;

    public Book(String title, String author, int pageCount) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be null or blank");
        }
        if (pageCount < 1) {
            throw new IllegalArgumentException("Page Count cannot be less that 1");
        }
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.status = BookStatus.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void borrowBook(){
        if (status == BookStatus.ON_LOAN){
            throw new IllegalArgumentException("Book is already on loan");
        }
        status=BookStatus.ON_LOAN;
    }

    public void returnBook() {
        if (status == BookStatus.AVAILABLE) {
            throw new IllegalArgumentException("Book is not currently on loan");
        }

        status = BookStatus.AVAILABLE;
    }
}
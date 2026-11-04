package ie.example1.oop.lastday;

public class Main {
    public static void main(String[] args) {

            Book first = new Book("Dune", "Frank", 412);
            Book middle = new Book ("Animal Farm", "George", 567);
            Book second = new Book("Clean Code", "Robert C. Mairtin", 464);

           LibraryService service = new LibraryService();

            service.addBook(first);
            service.addBook(middle);
            service.addBook(second);

            System.out.println("Book list: " + service.getBookCount());

            for (Book book: service.getAllBooks()){
                System.out.println(book.getTitle());
            }

            Book found = service.findBookByTitle("Dune");

            if(found != null){
                System.out.println(found.getTitle());
            }
            else{
                System.out.println("Book not found");
            }


    }
}

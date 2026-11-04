package ie.example1.oop.lastday;

public class Main {
    public static void main(String[] args) {
        try {
            Book myBook = new Book("Dune", "Frank", 412);
            System.out.println("Creating a new book");
        } catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

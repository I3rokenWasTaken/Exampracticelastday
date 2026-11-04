package ie.example1.oop.lastday;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AnotherMain {
    public static void main(String[] args){
        Path file = Path.of("data", "books.csv");

        List <String> lines = new ArrayList<>();
        lines.add("title, author, pagecount, status");
        lines.add("Dune, Frank, 412, AVAILABLE");
        lines.add("Clean Code, Robert C. Mairtin, 464, AVAILABLE");

        try{
            Files.createDirectories(file.getParent());
            Files.write(file, lines);
            System.out.println("File Created");
        }
        catch(IOException e){
            System.out.println("File not Created " + e.getMessage());
        }
    }
}

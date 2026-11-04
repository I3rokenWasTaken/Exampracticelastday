package ie.example1.oop.lastday;

import java.util.Scanner;

public class ExceptionWarmUp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Page Count");
        String message = sc.nextLine();
        try{
            int pagecount = Integer.parseInt(message);
            System.out.println("You entered: " + pagecount);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Input " + e.getMessage());
        }
    }

}

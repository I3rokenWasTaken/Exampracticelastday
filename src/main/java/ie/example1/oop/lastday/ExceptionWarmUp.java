package ie.example1.oop.lastday;

import java.util.Scanner;

public class ExceptionWarmUp {
    public static void main(String[] args){
        System.out.println("Enter a Message");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println("You entered: " + message);
        sc.close();
    }

}

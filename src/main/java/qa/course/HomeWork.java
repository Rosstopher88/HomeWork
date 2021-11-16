package qa.course;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Please enter your user name:");
        String name = consoleInput.nextLine();

        System.out.println("Please enter favourite hobby:");
        String hobby = consoleInput.nextLine();


        System.out.println("User name is " + name + " and have hobby " + hobby);


    }
}
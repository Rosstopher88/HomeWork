package qa.course;

import java.util.Scanner;

public class HomeWork19_11 {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter First Name");
        String MyName = consoleInput.nextLine();

        System.out.println("Enter Surname");
        System.out.println("My First Name is  " + MyName);


        String MySurname = consoleInput.nextLine();
        System.out.println("My Surname is " + MySurname);

        if (MyName == MySurname) {
            System.out.println("Same");
        } else {
            System.out.println("NotSame");

        }
        System.out.println("Word Counter");
        String str = consoleInput.nextLine();


        if (!str.isEmpty()) {
            System.out.println("Number of words in a string : " + str.replaceAll("[ ]+", " ").trim().split(" ").length);
        } else {
            System.out.println("String is empty");
        }


        String Merge = MyName + " " + MySurname;
        System.out.println(Merge);
    }
}




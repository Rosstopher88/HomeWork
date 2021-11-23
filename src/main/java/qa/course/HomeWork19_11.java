package qa.course;

import java.util.Scanner;

public class HomeWork19_11 {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        String MyName = consoleInput.nextLine();
        System.out.println("My First Name is  " + MyName);

        String MySurname = consoleInput.nextLine();
        System.out.println("My Surname is " + MySurname);

        if (MyName == MySurname) {
            System.out.println("Same");
        } else {
            System.out.println("NotSame");

        }

        String str = consoleInput.nextLine();

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);


        String Merge = MyName+" "+ MySurname;
        System.out.println(Merge);
    }
}



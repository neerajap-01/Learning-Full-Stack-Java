package org.practice.UserInput;

import java.util.Scanner;

public class UserInput {
    public void userName() {
        System.out.println("What's your name");
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine(); //This will allow user to enter with No data as well like empty spaces.
        String name = scanner.next();
        System.out.println("Hello, "+ name);
        scanner.close(); //optional for better coding you need to close it
    }

    public void userAge() {
        System.out.println("What's your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); //Restrict use to enter a number type
        System.out.println("Age, "+ age);
        scanner.close(); //optional for better coding you need to close it
    }
}

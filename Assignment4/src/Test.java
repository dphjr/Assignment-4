/*
Name: Dan Hannigan
Course: Programming Fundamentals
Semester: Summer 2020
Assignment: Set ADT
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Programming Fundamentals");
        System.out.println("Dan Hannigan");
        System.out.println("PROGRAMMING ASSIGNMENT 4 - SET\n");

        Set set = new Set();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String[] input = scan.nextLine().split(" ");

            try {
                String commandStr = input[0]; //separating string and integer to perform action
                int commandInt = Integer.parseInt(input[1]);

                switch (commandStr) { //using switch to keep infinite loop while performing action
                    case "add":
                        set.add(commandInt);
                        System.out.println(set.toString());
                        break;
                    case "del":
                        set.del(commandInt);
                        System.out.println(set.toString());
                        break;
                    case "exists":
                        System.out.println(set.exists(commandInt));
                        break;
                }
            }catch (Exception e) {
                System.out.println("Please enter a valid input.");
            }
        }
    }
}



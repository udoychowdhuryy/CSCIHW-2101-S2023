package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type int.
        ArrayList<Integer> nums = new ArrayList<Integer>(15);
        for (int i = 1; i <= 15; i++) {
            nums.add(i);
        }
        // b) Output the value of the tenth element of the array nums.
        System.out.println(nums.get(9));
        // c) Set the value of the 5th element of the array nums to 99.
        nums.set(4, 99);
        // d) set the value of the 13th element to 15
        nums.set(12, 15);
        // e) set the value of the 2nd element to 6
        nums.set(1, 6);
        // f) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
        nums.set(8, nums.get(12) + nums.get(1));
        // Print out the final state of the ArrayList
        System.out.println("Final state of the ArrayList: ");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();

         

    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

    // b) output each of the days of the week
        System.out.println("Days of the week:");
        for (String dayofweek : days) {
            System.out.println(dayofweek);
        }

    // c) output the days of the week that we have class (tuesday and thursday)
        System.out.println("Days with class:");
        System.out.println(days.get(1)); // Tuesday
        System.out.println(days.get(3)); // Thursday

    // d) change the arrayList to start on Sunday
        String sunday = days.remove(6); // remove Sunday from the end
        days.add(0, sunday); // add Sunday to the beginning

    // output the new order of the days
        System.out.println("New order of days:");
        for (String day : days) {
            System.out.println(day);
        }
    


    // Question 3 
        Scanner input = new Scanner(System.in);

        // Question 3
        // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();
            if (number != 0) {
                numbers.add(number);
            }
        } while (number != 0);

        // b) return the largest and smallest number
        if (numbers.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            int smallest = Collections.min(numbers);
            int largest = Collections.max(numbers);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        }

        // c) return the ArrayList sorted smallest to largest
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
        while (numbers.size() % 3 != 0) {
            System.out.print("Please enter " + (3 - numbers.size() % 3) + " more number(s) to create the matrix: ");
            number = input.nextInt();
            numbers.add(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
        }
    }
}
}






   


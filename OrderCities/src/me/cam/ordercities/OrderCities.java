package me.cam.ordercities;

import java.util.Scanner;

public class OrderCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First City:");
        String city1 = scanner.nextLine();

        System.out.println("Enter the Second City:");
        String city2 = scanner.nextLine();

        System.out.println("Enter the Third City:");
        String city3 = scanner.nextLine();

        // The faster way would be to use Arrays.sort()
        while (true) {
            boolean sorted = true;

            /*
            If any of the following conditions are met,
            sorted is set to false so that the loop can
            run again and check over all the conditions
            once more.

            The loops only breaks when none of the if-
            statements are run. In other words, it only
            breaks when the loops is sorted and keeps
            going if any of the conditions are met.
             */

            // I could using .toLowerCase on all the cities to make all the comparisons the same but
            // .compareToIgnoreCase seems like what you want me to use

            if (city2.compareToIgnoreCase(city1) < 0) {
                String temp = city1;
                city1 = city2;
                city2 = temp;
                sorted = false;
            }

            if (city3.compareToIgnoreCase(city1) < 0) {
                String temp = city1;
                city1 = city3;
                city3 = temp;
                sorted = false;
            }

            if (city3.compareToIgnoreCase(city2) < 0) {
                String temp = city2;
                city2 = city3;
                city3 = temp;
                sorted = false;
            }

            if (sorted) break;
        }

        System.out.println("The alphabetical order of the cities is: " + city1 + ", " + city2 + ", " + city3);
    }
}
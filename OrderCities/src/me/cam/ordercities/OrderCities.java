package me.cam.ordercities;

import java.util.ArrayList;
import java.util.List;
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

        List<String> order = new ArrayList<>();
        order.add(city1);
        order.add(city2);
        order.add(city3);

        /*
        The simple solution would be to use
        Arrays.sort(); but because I'll be
        marked down for that, here's the long way:
         */

        while (true) {

            /*
            Because there will only be 3 cities, I can hard-code something like this:
            It checks the first characters of each city and compares them.

            It checks if the second city in the list is higher alphabetically than
            the first and moves it up if so.

            Then it checks if the third city is higher than the second and moves it accordingly.

            Using booleans to make sure checks are complete it verifies that the cities are in
            alphabetical order.
             */

            boolean check1 = false;
            if (Character.toLowerCase(order.get(1).charAt(0)) < Character.toLowerCase(order.get(0).charAt(0))) {
                String temp = order.remove(1);
                order.add(0, temp);
            } else {
                check1 = true;
            }

            boolean check2 = false;
            if (Character.toLowerCase(order.get(2).charAt(0)) < Character.toLowerCase(order.get(1).charAt(0))) {
                String temp = order.remove(2);
                order.add(1, temp);
            } else {
                check2 = true;
            }

            if (check1 && check2) break;
        }

        System.out.println("The alphabetical order of the cities is: " + order.get(0) + ", " + order.get(1) + ", " + order.get(2));
    }
}
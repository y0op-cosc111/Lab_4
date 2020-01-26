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

            boolean check1 = false;
            if (Character.toLowerCase(order.get(1).charAt(0)) < Character.toLowerCase(order.get(0).charAt(0))) {
                String temp = order.remove(1);
                order.add(0, temp);
            } else {
                check1 = true;
            }

            boolean check2 = false;
            if (Character.toLowerCase(order.get(2).charAt(0)) < Character.toLowerCase(order.get(0).charAt(0))) {
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
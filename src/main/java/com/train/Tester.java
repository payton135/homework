package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int number = s.nextInt();
        System.out.println("How many round-trip tickets: ");
        int round_trip = s.nextInt();
        Ticket t = new Ticket(5,3);
        t.print();
    }
}

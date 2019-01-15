package com.train;

public class Ticket {
    int number;
    int round_trip;

    public Ticket(int number, int round_trip) {
        this.number = number;
        this.round_trip = round_trip;
    }

    void print(){
        double sum = ((number-round_trip)*1000) + (round_trip*2000*0.9);
        System.out.println("number= " + number);
        System.out.println("round_trip= " + round_trip);
        System.out.println("total= " + sum);
    }
}

package com.train

import java.util.*

fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    println("Please enter number of tickets: ");
    val number = s.nextInt();
    println("How many round-trip tickets: ");
    val round_trip = s.nextInt();
    val t = ticket_kotlin(number,round_trip)
    t.print()
}
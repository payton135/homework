package com.train

class ticket_kotlin(var number:Int,var round_trip:Int){

    fun print(){
        val sum = ((number-round_trip)*1000) + (round_trip*2000*0.9)
        println("number= " + number)
        println("round_trip= " + round_trip)
        println("total= " + sum)
    }
}
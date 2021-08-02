package com.m2000k.rolling

class DiceRoller(numOfSides : Int) {
val numOfsides = numOfSides;
    fun roll(): Int{
        return (1..numOfsides).random();
    }

}
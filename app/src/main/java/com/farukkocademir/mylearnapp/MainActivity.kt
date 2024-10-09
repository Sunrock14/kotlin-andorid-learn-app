package com.farukkocademir.mylearnapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val learn = Learn()
        learn.variables()
        learn.stringVariable()
        learn.arrayVariable()
        learn.listVariable()
        learn.setVariable()
        learn.mapVariable()
        learn.operators()
        learn.ifStatement()
        learn.switchStatement()
        learn.forLoop()
        learn.whileLoop()


    }
}

class Learn {
    fun variables(){

        //var is editable
        var surname = "Kocademir"
        surname = "Kocademir2"
        println(surname)

        //val is not editable && Constants
        val name = "Faruk"
        val age = 21
        val experience = 2
        val address = "Istanbul"
        val isMarried = false
        val salary = 1000.0
        val character = 'A'
        val longValue = 1234567890L
        val floatValue = 123.45f
        val doubleValue = 123.45
        var ageExperince = age + experience

        println(name)
        println(age)
        println(address)
        println(isMarried)
        println(salary)
        println(character)
        println(longValue)
        println(floatValue)
        println(doubleValue)
        println(ageExperince)


        // Required Types
        //Only accept same types
        var number : Int = 10
        number = 4214

        val longnumber : Long = number.toLong()
        val floatnumber : Float = number.toFloat()
        val doublenumber : Double = number.toDouble()
        val stringnumber : String = number.toString()
        val charnumber : Char = number.toChar()

        println(longnumber)
        println(floatnumber)
        println(doublenumber)
        println(stringnumber)
        println(charnumber)

        // Double && Float
        // Double is more precise than Float
        var pi : Double = 3.14159265359
        var pi2 : Float = 3.14159265359f

    }
    fun stringVariable(){
        //String
        val name : String = "Faruk"
        val surname : String = "Kocademir"

        val fullName : String = name + " " + surname

        println("-----------------------------string-----------------------------")
        println(fullName)
        println(name.capitalize())
        println(fullName.uppercase())
        println(fullName.lowercase())
        println(fullName.toString())



    }
    fun arrayVariable(){
        //Array
        var anyArray = arrayOf(1,2,3,4,5, "Faruk", "Kocademir")
        val numbers : Array<Int> = arrayOf(1,2,3,4,5)
        val names : Array<String> = arrayOf("Faruk","Kocademir")
        val mixed : Array<Any> = arrayOf(1,"Faruk",2,"Kocademir")
        val empty : Array<String> = arrayOf()

        println("-----------------------------array-----------------------------")
        println(anyArray[5])
        println(numbers[0])
        println(names[1])
        println(mixed[2])
        println(empty.isEmpty())

        numbers[0] = 10
        println(numbers[0])

        val size = numbers.size
        println(size)

        numbers.set(1,20)
        println(numbers[1])

        numbers.forEach {
            println(it)
        }

    }
    fun listVariable(){
        println("------------------list------------------")
        var numbers = listOf(1,2,3,4,5)
        val names = listOf("Faruk","Kocademir")
        val fruit = listOf("Apple","Banana","Cherry")
        val mixed = listOf(1,"Faruk",2,"Kocademir")
        val empty = listOf<String>("faruk", "kocademir")
        println(numbers)
        println(names)
        println(fruit)
        println(mixed)
        println(empty)

        val vegetables = arrayListOf<String>("Tomato","Potato","Carrot")
        var mixedarrayList = arrayListOf<Any>("Faruk",1,"Kocademir",2)
        vegetables.add("Onion")
        println(vegetables)

        mixedarrayList.add(3,"Kocademir")
        println(mixedarrayList)
    }
    fun setVariable(){
        println("------------------set------------------")
        //Set is a collection of unique elements
        val numbers = setOf(1,2,3,4,5,1,1,1,1,1,1)
        val names = setOf("Faruk","Kocademir")
        val fruit = setOf("Apple","Banana","Cherry")

        numbers.forEach {
            println("sadece bir lere ${it} yazabilirsin")
        }
        println(numbers.size)
        println(numbers)
        println(names)
        println(fruit)
    }
    fun mapVariable(){
        println("------------------map------------------")
        //Dictionary like a java hashmap
        //Map is a collection of key-value pairs
        val fruitCalories = mapOf("Apple" to 100,"Banana" to 200,"Cherry" to 300)
        val fruitColors = mapOf("Apple" to "Red","Banana" to "Yellow","Cherry" to "Red")
        println(fruitCalories)
        println(fruitColors)

        val fruitPrices = hashMapOf<String,Int>()
        fruitPrices.put("Apple",100)
        fruitPrices.put("Banana",200)
        fruitPrices.put("Cherry",300)
        println(fruitPrices)
    }
    fun operators(){
        println("------------------operators------------------")
        val number1 = 10
        val number2 = 20
        val number3 = 30
        val number4 = 40

        val result = number1 + number2
        println(result)

        val result2 = number3 - number4
        println(result2)

        val result3 = number1 * number2
        println(result3)

        val result4 = number4 / number3
        println(result4)

        val result5 = number4 % number3
        println(result5)

        val result6 = number1 + number2 * number3 / number4
        println(result6)

        val result7 = (number1 + number2) * number3 / number4
        println(result7)

        println(result == result2)
        println(result != result2)
        println(result < result2)
        println(result > result2)
        println(result <= result2)
        println(result >= result2)

        println(result == result7 && result2 == result)
        println(result == result7 || result2 == result)
        println(!(result == result7))

    }
    fun ifStatement(){
        println("------------------ifStatement------------------")
        val number1 = 10
        val number2 = 20

        if(number1 > number2){
            println("number1 is greater than number2")
        }else if(number1 < number2){
            println("number1 is less than number2")
        }

    }
    fun switchStatement(){
        println("------------------switchStatement------------------")
        val number = 1
        when(number){
            1 -> println("number is 1")
            2 -> println("number is 2")
            3 -> println("number is 3")
            else -> println("number is not 1,2,3")

    }
}
    fun forLoop(){
        println("------------------forLoop------------------")
        for(i in 1..10){
            println(i)
        }

        for(i in 1..10 step 2){
            println(i)
        }

        for(i in 10 downTo 1){
            println(i)
        }

        for(i in 1 until 10){
            println(i)
        }

        val numbers = arrayOf(1,2,3,4,5)
        for(i in numbers){
            println(i)
        }

        val names = arrayOf("Faruk","Kocademir")
        for(i in names){
            println(i)
        }

        for((index,value) in numbers.withIndex()){
            println("$index : $value")
        }

    }
    fun whileLoop(){
        println("------------------whileLoop------------------")
        var i = 1
        while(i < 10){
            println(i)
            i++
        }

        var j = 10
        do{
            println(j)
            j++
        }while(j < 10)

        var k = 1
        while(k < 10){
            println(k)
            k++
            if(k == 5){

                println("break")

            }
        }

    }
}



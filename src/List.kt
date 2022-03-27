
/**
 * Program that implements classes for diferent kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables
 * */
import kotlin.math.PI
import kotlin.math.sqrt

fun main(){

    //list
//    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
//    println("List: $numbers")
//    println("Size: ${numbers.size}")
//    println("First element: ${numbers[0]}")
//    println("Second element: ${numbers[1]}")
//    println("Last element: ${numbers[numbers.size - 1]}")
//    println("First element: ${numbers.first()}")
//    println("Last: ${numbers.last()}")
//    println("Contains4: ${numbers.contains(4)}")
//
//    println()
//
//    //mutable list
//    val entrees: MutableList<String> = mutableListOf()
//    println("Add Noodles: ${entrees.add("noodles")}")
//    println("Add Noodles: ${entrees.add("sphagetti")}")
//    println("Entrees: $entrees")
//
//    val moreItems = listOf("ravioli", "lasgna", "fettucine")
//    entrees.addAll(moreItems)
//    println("entrees: $entrees")

    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    while (index < guestsPerFamily.size){
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("total guests: $totalGuests")









}

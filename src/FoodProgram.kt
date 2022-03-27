
/**
 * Program that implements classes for diferent kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables
 * */
import kotlin.math.PI
import kotlin.math.sqrt

open class Item(val name: String, val price: Int)
class  Noodles : Item("Noddles", 10){
    override fun toString(): String {
        return name
    }
}
class Vegetables(vararg val toppings: String): Item("Vegetables", 5){
    override fun toString(): String {
        if(toppings.isEmpty()){
            return "$name Chefs Choice"
        }
        else{
            return name + " " + toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int){
    private val itemList = mutableListOf<Item>()
    fun addItem(newItem: Item){
        itemList.add(newItem)
    }
    fun addAll(newItems: List<Item>){
        itemList.addAll(newItems)
    }

    fun print(){
        println("Order ${orderNumber}")
        var total = 0
        for(item in itemList){
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun main(){
    val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()
}


package main

/**
 * Created by rheehot@gmail.com on 2018-11-24
 * Blog : http://jowlee.blog.me
 * Github : http://github.com/rheehot
 */
//fun main.main(args:Array<String>){
////    println("Hello World!")
//    val reMax = max(1,2 )
//    println(reMax)
//}
//
//fun max(a: Int, b:Int): Int{
//    return if( a > b) a else b
//}

//fun printMany(vararg elements: Int){
//    for (element in elements){
//        println(message = element)
//    }
//    doSomething(*elements)
//}

//fun main.main(args: Array<String>){
//    printMany(1, 2, 3, 4)
//}

//fun doSomething (vararg elements: Int) {
//    for (element in elements){
//        println(message = element)
//    }
//}


// local function

//fun String.lastChar() = this.get(this.length - 1)
//fun main.main(args: Array<String>){
//    println("abc".lastChar())
//
//}
//
//fun foo(fooParam : String){
//    val outerFunction = "outerFunction"
//    fun bar(barParam: String){
//        println(barParam)
//        println(fooParam)
//        println(outerFunction)
//    }
//    bar(fooParam)
//}
//
//
//fun main.main(args: Array<String>){
//    foo("fooParam")
//
//}


//lowerCase
//fun higherOrder(value: String, op: (String) -> String ): String{
//    println("Executing the operation $op")
//    return op(value)
//}
//fun lowerCase(value:String) = value.toLowerCase()
//
//fun main.main(args: Array<String>){
//    println(higherOrder("Hello", ::lowerCase))
//
//}
//

//fun main.main(args:Array<String>){
//    val string = "one, two, three"
//
//    println(string.filter({ c : Char -> c in 'a'..'z' }))
//    println(string.filter(){ c : Char -> c in 'a'..'z' })
//    println(string.filter{c : Char -> c in 'a'..'z'})
//    println(string.filter{ c-> c in 'a'..'z'})
//    println(string.filter { it in 'a'..'z' })
//}
//
//
//fun unaryOperation (x: Int, op:(Int) -> Int): Int {
//    return op(x)
//}
//
//fun outsideFunction(){
//    for (number in 1..30){
//        println(unaryOperation(20) {
//            x -> println(number)
//            x * number
//        })
//    }
//}
//
//fun main.main(args: Array<String>){
//    outsideFunction()
//}

//
//fun printMany (vararg elements : Int) {
//    for(element in elements){
//        println(message = element)
//    }
//    println(elements.javaClass.name)
//    doSomething(*elements)
//}
//
//fun doSomething(vararg elements: Int){
//    for (element in elements){
//        println(message = element)
//    }
//}
//
//fun main.main(args: Array<String>){
//    printMany(1,2,3,4)
//}
//
//
//fun main.main(args:Array<String>){
//    var string = "one, two, three"
//
//    string.filter { c:Char -> c in 'a'..'z' }
//    string.filter { it in 'a'..'z' }
//}

/// #### Study 2 Day ############

//class main.Person constructor(firstName: String) {
//}
//
//class Person1  (firstName: String) {
//}
//
//class Address {
//    var name: String = ""
//    var street: String = ""
//    var city: String = ""
//    var state: String? = ""
//    var zip: String = ""
//}
////자바필드처럼이름으로프로퍼티를참조할수있다:
//fun copyAddress(address: Address): Address {
//    val result = Address() // 코틀린에 'new' 키워드 없음
//    result.name = address.name // 접근자(accessor)를 실행
//    result.street = address.street
//// ...
//    return result
//}
//
//class main.Person constructor(val name:String, val age: Int) {
//    constructor(name : String) : this(name, 99)
//
//    fun hello(){
//        println("Hello $name!")
//    }
//}
//
//fun main.main(args: Array<String>){
//    val person = main.Person("Alice", 26)
//    println(person.name)
//    person.hello()
//}


//class Rectangle(val height:Int, val width: Int) {
//
//    val isSquare : Boolean
//        get(){
//            return height == width
//        }
//}
//
//fun main.main(args: Array<String>){
//    val rectangle = Rectangle(41, 43)
//    println(rectangle.isSquare)
//}

//fun main.main(args:Array<String>){
//    val set1 = setOf(1,2,3)
//    val set2 = setOf(1,2,3)
//
//    println(set1.toString())
//    println(set2.toString())
//
//    println(set1 === set2)
//    println(set1 == set2)
//}
//[1, 2, 3]
//[1, 2, 3]
//false
//true

open class Person{
    open fun validate(){
        println("main.Person validate!")
    }
}
// override
//open class Customer : main.Person(){
//    final override fun validate(){
//        println("customer validate!")
//    }
//}
//
//class SpecialCustomer : Customer(){
//
//}
//
//fun main.main(args:Array<String>){
//    val person = main.Person()
//    person.validate()
//
//    val customer = Customer()
//    customer.validate()
//}

//main.Person validate!
//customer validate!
//
//abstract class StoredEntity {
//
//    val isActive = true
//    abstract fun store()
//    fun status(): String {
//        return "status " + isActive.toString()
//    }
//}
// class Employee : StoredEntity(){
//        override fun store(){
////            throw UnsupportedOperationException("not implemented")
//            TODO("not implemented")
//        }
// }
//
//fun main.main(args: Array<String>){
//    val se = Employee()
//    println(se.isActive)
//    println(se.status())
//    se.store()
//}

//true
//status true

//
interface Interface1 {
    fun functionA(){
        println("Fun A from Interface 1")
    }
}

interface Interface2 {
    fun functionA(){
        println("Fun A from Interface 2")
    }
}

class Class1And2 : Interface1, Interface2 {
    override fun functionA(){
        super<Interface2>.functionA()
    }
}

fun main(args:Array<String>){
    val c = Class1And2()
    c.functionA()
}

//Fun A from Interface 2
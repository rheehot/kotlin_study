package main

import main.util.someJavaClass
import kotlin.properties.Delegates
import kotlin.reflect.KProperty
import main.util.somethingPrint as anotherNameFunction

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

//open class Person{
//    open fun validate(){
//        println("main.Person validate!")
//    }
//}
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
//interface Interface1 {
//    fun functionA(){
//        println("Fun A from Interface 1")
//    }
//}
//
//interface Interface2 {
//    fun functionA(){
//        println("Fun A from Interface 2")
//    }
//}
//
//class Class1And2 : Interface1, Interface2 {
//    override fun functionA(){
//        super<Interface2>.functionA()
//    }
//}

//
//fun main(args:Array<String>){
////    val c = Class1And2()
////    c.functionA()
//
//    anotherNameFunction("hello")
//    someJavaClass.printSomeThing("hello java")
//
//}

//Fun A from Interface 2

//data class Person (val name : String, val age: Int)
//
//fun main(args: Array<String>){
//    val person1 = Person("Alice", 21)
//    val person2 = Person("Alice", 21)
//
//    println(person1)
//    println(person1 == person2)
//}

//Person(name=Alice, age=21)
//true

//data class Person (val name : String, val age: Int)
//
//fun main(args: Array<String>){
//
//    val (country, city) = Pair("Spain","Madrid")
//
//    val (country1, city1, continent1) = Triple("Spain","Madrid","Europe")
//
//    val(_,age) = Person("Joe Smith", 42)
//
//    val person = Person("Joe Smith", 42)
//
//}

// inner
// Nested
//
//class Outer {
//    private val bar: Int = 1
//
//    class Nested{
//        fun foo() = 2
//    }
//}
//
//class OuterWithInner {
//    private val bar: Int = 1
//
//    inner class Inner {
//        fun foo() = 2
//    }
//}
//
//fun main (args:Array<String>){
//    val outer = Outer.Nested().foo() // ==2
//    println(outer)
//
//    val outerWithInner = OuterWithInner().Inner().foo() // ==1
//    println(outerWithInner)
//}

//
//class Stack<E>(private vararg val items: E){
//    private val elements = items.reversed().toMutableList()
////    private val elements = items.reversed().toList()
//
//    fun push(element: E){
//        elements.add(0, element)
//    }
//
//    fun pop() : E? {
//        if(!isEmpty())
//            return elements.removeAt(0)
//        return null
//    }
//
//    private fun isEmpty() : Boolean {
//        return elements.isEmpty()
//    }
//}
//
//fun <T> stackOf(vararg elements: T) : Stack<T>{
//    return Stack(*elements)
//}
//
//fun main (args: Array<String>){
//    val stack = Stack(1,2,3,4)
//    stack.push(3)
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//
//    val stack2 = stackOf("가","나","다","라")
//
//    println(stack2.pop())
//}

//3
//4
//3
//2
//1
//�씪
//
//interface ReadOnlyRepo<out T>{
//    fun getId(id:Int)
//    fun getAll()
//}
//
//class Example(){
//    var p: String by Delegate()
//}
//
//class Delegate{
//    operator fun getValue(thisRef:Any?, property: KProperty<*>)
//        : String {
//        return "$thisRef 에 할당된 Example 객체는 '${property.name}'" +
//                "Delete 클래스에 위임했습니다."
//    }
//
//    operator fun setValue(thisRef: Any?, property: KProperty<*> , value:String)
//    {
//        println("Example 클래스가 생성되어 ${thisRef} 할당되고," +
//        "$value 타입의 객체가 멤버변수 '${property.name}'에" +
//        " 할당되었습니다")
//    }
//}
//
//fun main(args:Array<String>){
//    val example = Example()
//    example.p = "String"
//    println(example.p)
//}

class Person (val name:String, age:Int, salary : Int){
    private val observer = {
        prop:KProperty<*>, oldValue: Int, newValue:Int ->
        println("Property value $oldValue has changed to $newValue")
    }
    var age: Int by Delegates.observable(age, observer)
    var salary : Int by Delegates.observable(salary, observer)
}

fun main(args:Array<String>){
    val person = Person("Alice", 25, 30000)
    person.age++
    person.salary+=100

//    println(person.age)
//    println(person.salary)
}
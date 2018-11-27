/**
 * Created by rheehot@gmail.com on 2018-11-24
 * Blog : http://jowlee.blog.me
 * Github : http://github.com/rheehot
 */
//fun main(args:Array<String>){
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

//fun main(args: Array<String>){
//    printMany(1, 2, 3, 4)
//}

//fun doSomething (vararg elements: Int) {
//    for (element in elements){
//        println(message = element)
//    }
//}


// local function

//fun String.lastChar() = this.get(this.length - 1)
//fun main(args: Array<String>){
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
//fun main(args: Array<String>){
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
//fun main(args: Array<String>){
//    println(higherOrder("Hello", ::lowerCase))
//
//}
//

//fun main(args:Array<String>){
//    val string = "one, two, three"
//
//    println(string.filter({ c : Char -> c in 'a'..'z' }))
//    println(string.filter(){ c : Char -> c in 'a'..'z' })
//    println(string.filter{c : Char -> c in 'a'..'z'})
//    println(string.filter{ c-> c in 'a'..'z'})
//    println(string.filter { it in 'a'..'z' })
//}

fun unaryOperation (x: Int, op:(Int) -> Int): Int {
    return op(x)
}

fun outsideFunction(){
    for (number in 1..30){
        println(unaryOperation(20,{
            x -> println(number)
            x * number
        }))
    }
}

fun main(args: Array<String>){
    outsideFunction()
}


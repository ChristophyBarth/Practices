//A function that returns hello world
fun greeting (): String {
    val greet = "Hello World"
    println(greet)
    return greet
}

//A function that reverse a string
fun reverse (firstWord:String, secondWord:String){

    println("Here they are")
    println(secondWord)
    println(firstWord)

}

//A function that returns the grater of three numbers
fun greater (a:Double, b:Double, c:Double){

    when {
        a>b && a>c -> {print(a)}
        b>a && b>c -> print(b)
        c>a && c>b -> print(c)
    }
    println(" is the Bigger number")
}

fun main (){
    greeting()
    println("Input 3 numbers below(one after the other)")
    greater(a = readLine()!!.toDouble(), b = readLine()!!.toDouble(), c = readLine()!!.toDouble())
    println("Input two words and I'll reverse them")
    reverse(firstWord = readLine()!!.toString(), secondWord = readLine()!!.toString())
}

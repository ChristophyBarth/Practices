fun main (args:Array<String>){

    println()
    println("Hello, You are about to perform multiple operations")
    println("Input your first number")
    val fi = readLine()!!.toDouble()
    println("Nice. Now the second number")
    val si = readLine()!!.toDouble()

    val sub = fi - si
    val add = fi + si
    val mul = fi * si
    val div = fi / si
    val mod = fi % si

    println("There you go...")
    println("$fi - $si = $sub")
    println("$fi + $si = $add")
    println("$fi × $si = $mul")
    println("$fi ÷ $si = $div")
    println("$fi % $si = $mod")




}
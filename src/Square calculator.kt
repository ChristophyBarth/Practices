fun main (){
    val num = readLine()!!.toDouble()
    print("The Square of $num is ")
    println(num * num)

    println("Tell me the radius of a circle and I'll tell you its circumference")
    val input = readLine()!!.toDouble()
    println("Was that in centimeter or Meter\nInput 1 for CM\nInput 2 for M")
    val selection = readLine()!!.toDouble()


    if (selection == 1.0){
        println("The circumference is ${2 * 3.1428 * input}CM")

    }

    if (selection == 2.0){
        val unit = input/100
        println("The circumference is ${2 * 3.1428 * unit}M")

    }
}
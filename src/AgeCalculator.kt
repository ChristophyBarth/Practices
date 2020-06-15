import java.util.*

fun main(args: Array<String>){

    print("Input Your Name Below\n")
    val getName = readLine()!!.toString()
    println("Thanks! What year were you born?")
    val getYear = readLine()!!.toInt()

    val presentYear : Int = Calendar.getInstance().get(Calendar.YEAR)

   val age = presentYear - getYear

    print("Alright $getName, You are $age years old")


}

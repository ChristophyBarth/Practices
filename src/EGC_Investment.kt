import java.text.DecimalFormat

fun profit () {

    println("How much do you want to Invest?")
    val p = readLine()!!.toDouble()
    println("The interest rate is 1.3")
    val r = 1.3
    val cash = p * r

    //Finally! The code to remove zero from a double
    //val df = DecimalFormat("###.#########")
    // println(df.format(cash))

    val df = DecimalFormat("##.#########")
    println(df.format(cash))

    println("Your Cash-out in one week time is ${df.format(cash)}")

    println("After your withdrawal, would you like to reinvest all?\nYes = 1\nSome = 2\nNo = 3")
    val reinvest = readLine()!!.toInt()
    if (reinvest == 1){
        val p = cash
        println("The interest rate is 1.3")
        val r = 1.3
        val cash = p * r

        println("Your Cash-out for the upper week is $cash")

    }
    else if (reinvest == 2){
        profit()
    }
    else if (reinvest == 3) {
        println("Thanks for being a part of our investment scheme!")

    }
    else println("Invalid input! Try again")
}

fun main (){
    println("Welcome to EGC investment scheme.")
    profit()
}

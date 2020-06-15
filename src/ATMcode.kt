fun main () {

    for (i in 1..5) {

        println("Input Your Name Below: ")
        val name = readLine()!!.toString()

      loop@  for (i in 1..5) {


          println("Hello There $name!\nInput 1 to deposit\nInput 2 to withdraw")
          val option = readLine()!!.toInt()


          loop@ when (option) {
              1 -> println("How much do you want to deposit?")
              2 -> println("How much do you want to withdraw?")
              else -> println("Invalid input!")
          }

          var bal = 200000
          var newBal: Int
          val amount = readLine()!!.toInt()

          if (option == 1) {
              newBal = bal + amount
              println("Deposit Successful! Your balance is $$newBal\n")
              println("Do you want to perform another transaction?\nIf yes, Input 1\nIf no, Input 2")
              val anotherTra = readLine()!!.toInt()
              if (anotherTra == 1) println(
                      "Restarting ATM...")
              else break@loop
          }



          if (option == 2) {
              newBal = bal - amount
              if (newBal <= 500) {
                  println("Insufficient balance!")
                  break@loop
              } else {
                  bal = newBal
                  println("Withdrawal Successful! Your balance is $$bal\n")
                  println("Do you want to perform another transaction?\nIf yes, Input 1\nIf no, Input 2")
                  val anotherTra = readLine()!!.toInt()
                  if (anotherTra == 1) println("Restarting ATM...")
                  else break@loop
              }
          }
      }

    }
    println("Thank you for using our service!")
}

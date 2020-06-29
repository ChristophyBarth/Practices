package warGame.play

fun main (){
//    val rollingDie = RollingDie(10)//calling the constructor
//    val sixSided = RollingDie ()
//    val sixSided = RollingDie ()
//    val tenSided = RollingDie (10)
//    println(sixSided.sidesCount)
//    println(sixSided.sidesCount)

////    Rolls 6 sided dice
//    println(sixSided)
//    for (i in 0..9){
//        println(sixSided.roll().toString() + " ")
//    }
////    Rolls 10 sided dice
//    println(tenSided)
//    for (i in 0..9) {
//        println(tenSided.roll().toString() + " ")
//    }


//    var u : User? = User ("James", 20)
//    var v : User? = User ("Chris", 178)
//    println("u: $u ${u.hashCode()}")
//    println("v: $v ${v.hashCode()}\n")
//
//    u = v
//    println("u: $u ${u.hashCode()}")
//    println("v: $v ${v.hashCode()}\n")
//
//    v!!.name = "Charles"
//    println("u: $u ${u.hashCode()}")
//    println("v: $v ${v.hashCode()}\n")
//
//    v = null
//    println("u: $u ${u.hashCode()}")
//    println("v: $v ${v.hashCode()}\n")

    val die = RollingDie(10)
    val warName1 = "Smasher🔨"
    val warName2 = "Venom\uD83D\uDC0D"
    val warName3 = "Striker🗡"

    println("Hello and welcome to the Game!")
    println("What is your name?")
    val name = readLine()!!.toString()
    println("What is your rival's name?")
    val rivalsName = readLine()!!.toString()
    println("Great!\n\nThere are 3 characters available.\n$warName1\n$warName2\n$warName3\n\n$name, your warrior is $warName1, while $rivalsName's warrior is $warName2\n")
//    println("Thanks!\nThere are 3 characters available.\n$warName1\n$warName2\n$warName3\n\n$name, which warrior do you prefer?\n" +
//            "Input 1 for $warName1\nInput 2 for $warName2\n" +
//            "Input 3 for $warName3")
//    val input = readLine()!!.toInt()
//    if (input ==1){
//        val warrior = Warrior( name,100, 20, 10, die)


    val warrior = Warrior(name, 100, 20, 10, die)
    val warrior2 = Warrior(rivalsName, 100, 19, 11, die)
    //   val warrior3 = Warrior( rivalsName, 100, 21, 9, die)

//    println("Alive:  ${warrior.alive()}")


    println("$warName1${warrior.healthBar()}")
    println("$warName2${warrior2.healthBar()}\n")

    println("All right warriors! Let the game begin!\n")


    for (i in 0 until 20) {

        if ( warrior.dead()) {
            println("$warName1 is dead!; $warName2 won the game!!")
            break
        }

        warrior.attack(warrior2) //attack test


        println("$warName1${warrior.healthBar()}")
        println("$warName2${warrior2.healthBar()}\n\n")

        if ( warrior2.dead()) {
            println("$warName2 is dead!; $warName1 won the game!!")
            break
        }

        warrior2.attack2(warrior) //second attack test

        println("$warName1${warrior.healthBar()}")
        println("$warName2${warrior2.healthBar()}\n\n")


    }
    println("Game Over!")
}


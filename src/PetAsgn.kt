fun main (){
    println ("Hey, I'm an assistant called Cazi.\n        What's your name?")
    val name =readLine()!!.toString()
    println("Alright $name! How many pets do you have?")
    val np = readLine()!!.toInt()

    val numberOfPets = Array (np) {""}


    println("Amazing!\nI'll ask for the names of your pets individually, so input the names one after the other")


    for (i in 0 until np) {
        println("Enter pet No${i+1}")
        numberOfPets[i] = readLine()!!.toString()

    }
    println("Your pets are: ")
    for (i in 0 until np){
        println("Pet ${i+1}: ${numberOfPets[i]}")
    }

    if (numberOfPets.contains("Cat")) {
        println("Hey $name, I noticed you also own a Cat\nJust so you know, we have a program for cat owners")
    }


}
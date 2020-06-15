//Code not correct

fun main (){
    val b = readLine()!!.toInt()
    for (i in 2..100){
        if (b%i==0) {
            println("$i is Prime")
        }
    }
}
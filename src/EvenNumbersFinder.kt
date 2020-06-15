//fun main () {
//
//    println("Even Numbers")
//    for (num in 0..100){
//        if (num%2==1){
//            continue
//        }
//        println(num)
//    }
//
//}



fun main (){
    println("Here are the even numbers in the range of 1 to 1000")
    for (odd in 1..1000 step 2)
       println(odd-1)
}
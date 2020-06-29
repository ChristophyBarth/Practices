package warGame.play

//class RollingDie (sidesCount:Int){
//    val sidesCount: Int
//
////    val sidesCount: Int = sidesCount
//    init {
//        this.sidesCount = sidesCount
//    }
//
//
//    constructor():this(6)
//}

class RollingDie(val sidesCount: Int){
    constructor():this(30)

    fun roll (): Int {
        return (1..sidesCount).shuffled().first()
    }

    override fun toString(): String {
        return "A rolling die with $sidesCount sides"
    }
}
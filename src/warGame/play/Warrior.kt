package warGame.play

import kotlin.math.round

class Warrior(private var name: String, private var _health: Int, private val damage: Int, private val defense: Int, private val die: RollingDie) {

    private var currentHealth = _health


    fun alive(): Boolean {
        return currentHealth > 0
    }

    fun dead(): Boolean {
        return currentHealth <= 0
    }
    fun healthBar():String{
        var s = "["
        val healthBarNum = 20
        var count = round((currentHealth.toDouble()/_health) * healthBarNum).toInt()
        if ((count< 1 ) && (alive())){
            count = 1
        }

        //to avoid a HP above 20
        if (count > 20){
            count=20
        }

        s = s.padEnd(count+s.length,'☯')
        s = s.padEnd(healthBarNum - count +s.length)
        s+="]$count"+"HP"
        return s
    }
    fun defend(hit: Int){
        val totalDefense = defense + die.roll()
        val injury = hit - totalDefense
        if (currentHealth>0){
            currentHealth = currentHealth - injury
            if (currentHealth<=0){
                currentHealth=0
            }
        }
        println("$warName1 hits with a damage of $hit☠︎")
        println("$warName2 defends with a shield of $totalDefense🛡\n")
    }

    fun defend2(hit: Int){
        val totalDefense = defense + die.roll()
        val injury = hit - totalDefense
        if (currentHealth>0){
            currentHealth = currentHealth - injury
            if (currentHealth<=0){
                currentHealth=0
            }
        }
        println("$warName2 hits with a damage of $hit☠︎")
        println("$warName1 defends with a shield of $totalDefense🛡\n")
    }
    fun attack(enemy:Warrior){
        val hit = damage + die.roll()
        enemy.defend(hit)
    }

    fun attack2(enemy:Warrior){
        val hit = damage + die.roll()
        enemy.defend2(hit)
    }

}

val warName1: String = "Smasher🔨"
val warName2: String = "Venom\uD83D\uDC0D"
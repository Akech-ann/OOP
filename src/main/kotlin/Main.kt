fun main() {
    var ann = Human("Akech",20,54.5)
    ann.eat(3)
    ann.speak("I am a perfectionist")
    ann.birthday()
    println(ann.age)
    var me = anny("Akechi","Montana","akechann@gmail.com","073849484",64546)
    println(me.email)
    println(me.lastname)
}
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        weight+=foodweight
    }
    fun speak(speech:String){
        println(speech)


    }
    fun birthday(){
        age += 1


    }


}
data class anny(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:Int)

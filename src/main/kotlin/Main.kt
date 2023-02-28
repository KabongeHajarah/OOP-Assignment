fun main() {
var human1= Human("Bella",21,62)
human1.eat(6)
    println(human1.weight)
    println( " I am eating  ${human1.weight} kgs of food" )

  human1.speak("hello")
    human1.birthday(1)
    println(human1.age)
    var personData= User("Kabonge","Hajarah","kabongehajarah@gmail.com",83282102,"shabellah")
println(personData.firstName)
    println(personData.email)

}
class Human( var name:String ,var age:Int , var weight:Int ){
   fun eat(foodWeight:Int ){
       println( "I am eating $foodWeight kgs of food")
weight+=foodWeight


   }
fun speak(speech:String){
    println(" Hello there am called Bella and you?")
}
fun birthday( increment:Int){
    age+=increment

}
}
data class User(var firstName: String,var lastName:String,var email:String,var  phoneNumber: Int, var password:String)


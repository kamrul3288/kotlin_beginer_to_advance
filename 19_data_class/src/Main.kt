fun main(args: Array<String>) {

    val user1 = User(name = "Kamrul Hasan",age = 23)
    val user2 = User(name = "Kamrul Hasan",age = 23)

    if (user1 == user2){
        println("user1 and user2 object is equal")
    }else{
        println("user1 and user2 object is not equal")
    }

    println("User Class $user1")

    val person = Person(name = "Kamrul Hasan",age = 23)
    println("Person Class $person")

}


data class User(var name:String, var age:Int){

}

class Person(var name:String, var age:Int){

}
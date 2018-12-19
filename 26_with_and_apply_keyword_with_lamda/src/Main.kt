fun main(args: Array<String>) {

   /*
   THE NORMAL WAY TO DO THIS

   val person = Person()
    person.name = "My Name"
    person.age = 10
    person.displayInfo()

    */

    val person = Person()
    with(person){
        name = "My Name"
        age = 10
        displayInfo()
    }


    // apply keyword return receiver
    person.apply {
        name = "My Last Name"
        age = 23
    }.displayInfo()



}


class Person{
    var name:String = "Kamrul Hasan"
    var age:Int = 23

    fun displayInfo(){
        println(name)
        println(age)
    }
}
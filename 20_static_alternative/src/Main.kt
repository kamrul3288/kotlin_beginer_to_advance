fun main(args: Array<String>) {


    //User.name it's not accessible without creating object

    Person.name // it is accessible without creating object

}


object Person{
    var name:String  = "Kamrul Hasan"
}

class User{
    var name:String  = "Kamrul Hasan"
}
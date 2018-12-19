fun main(args: Array<String>) {



    val personObj = Person(name = "Kamrul", age = 23);
    personObj.displayInfo()


    val multipleCons1 = MultipleConstructor(name = "Kamrul")
    multipleCons1.displayInfo()

    val multipleCons2 = MultipleConstructor(age = 23,address = "Dhaka")
    multipleCons2.displayInfo()

}
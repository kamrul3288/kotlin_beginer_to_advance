fun main(args: Array<String>) {

    val cat = Cat()
    cat.name = "A"
    cat.color = "white"
    cat.meaow()
    cat.eat()

    val dog = Dog();
    dog.name = "B"
    dog.color = "black"
    dog.bark()
    dog.eat()


}

open class Animal{
    var name:String =""
    var color:String = ""

    open fun eat(){
        println("Animal eating")
    }
}

class Cat : Animal() {
    fun meaow():String{
        return "meaow"
    }

    override fun eat(){
        println("Cat is eating")
    }
}

class Dog : Animal(){
    fun bark():String{
        return "gheu"
    }

    override fun eat(){
        super.eat()
        println("Dog is eating")
    }
}
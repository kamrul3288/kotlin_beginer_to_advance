class MultipleConstructor {

    var name:String = ""
    var address:String = ""
    var age:Int = 0

    constructor(name:String){
        this.name = name;
    }

    constructor(age:Int,address:String){
        this.address = address
        this.age = age;
    }

    fun displayInfo(){
        println(name)
        println(age)
        println(address)
    }
}
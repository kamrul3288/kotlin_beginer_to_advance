fun main(args: Array<String>) {

    val person = PersonImpl()
    person.showName("Kamrul")
    person.showAddress("Dhaka")

}

interface Person{
    fun showName(name:String)
    fun showAddress(address:String)
}

class PersonImpl: Person{
    override fun showName(name: String) {
        println(name)
    }

    override fun showAddress(address: String) {
        println(address)
    }


}
fun main(args: Array<String>) {

    val employee = Employee();
    employee.showInfo()
    employee.salary()

    val strResult = "Hey".add("I","am kamrul")
    println(strResult)

}

//-------real practice -----------
fun String.add(var1:String,var2:String):String{
    return this + var1 + var2;
}


fun Employee.salary(){
    println("Salary: 60k")
}


class Employee{
    fun showInfo() {
        println("Name: Kamrul Hasan")
        println("Age: 23")
    }
}



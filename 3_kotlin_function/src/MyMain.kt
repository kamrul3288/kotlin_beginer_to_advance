fun main(args: Array<String>) {


    displayInfo()

    println(provideSumResult(var1 = 10,var2 = 20))

}

//----------void function----------------------------
fun displayInfo(){
    println("Name: Kamrul Hasan")
    println("Age: 23")
    println("Address: Dhaka");
}

//-------------return type function--------------------
fun provideSumResult(var1:Int, var2:Int):Int{
    return var1+var2;
}


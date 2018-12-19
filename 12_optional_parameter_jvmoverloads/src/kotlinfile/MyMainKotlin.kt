package kotlinfile

fun main(args: Array<String>) {

    println("The result is: ${returnSum(10,20)}")

    println("The result is: ${returnSum(10,20,20)}")
}


fun returnSum(var1:Int, var2:Int , var3:Int = 10):Int {
    return var1 + var2 + var3
}

@JvmOverloads
fun returnSumForJavaFile(var1:Int, var2:Int , var3:Int = 10):Int{
    return  var1 + var2 + var3;
}
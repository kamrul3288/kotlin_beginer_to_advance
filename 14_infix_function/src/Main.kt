fun main(args: Array<String>) {

    val result = 5 greaterValue 1
    println(result)

    val exResult = 8.expressionFunctionGreaterValue(10);
    println(exResult)

}

infix fun Int.greaterValue(var1:Int):Int{
    return if (this>var1)
        this
    else
        var1
}

fun Int.expressionFunctionGreaterValue(var1:Int):Int{
    return if (this>var1)
        this
    else
        var1
}

// all infix function is extension function . all extension function is not a infix function
// infix function have only one parameter
fun main(args: Array<String>) {

    //-----without it keyword-------
    val lamDaExpression = {message:String -> message.reversed()}
    reverseAndDisplayWithoutItKeyWord("Hello World",lamDaExpression)

    //---------with it keyword-------------------
    //val lamDaExpression = {it.reversed()}   you can use it also
    reverseAndDisplayWithItKeyWord("Hello World",{it.reversed()})

    // it keyword support only one parameter

}

fun reverseAndDisplayWithoutItKeyWord(message:String, action: (String)->String){
    val result = action(message)
    println(result)
}


fun reverseAndDisplayWithItKeyWord(message:String, action: (String)->String){
    val result = action(message)
    println(result)
}
fun main(args: Array<String>) {
    
    val lamdaExpression = {s:Int -> println(s)}

    addTwoNumber(10,20,lamdaExpression)
}


fun addTwoNumber(a:Int,b:Int, action: (Int) -> Unit){
    val sum = a+b
    action(sum)
}
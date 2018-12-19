fun main(args: Array<String>) {

    sumTwoNumber(10,10,object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })
}

fun sumTwoNumber(a:Int, b:Int, action: MyInterface){
    val sum = a+b
    action.execute(sum)
}


interface MyInterface{
    fun execute(sum:Int)
}
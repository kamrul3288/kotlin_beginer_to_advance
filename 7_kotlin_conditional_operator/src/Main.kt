fun main(args: Array<String>) {


    // if statement

    val a = 2
    val b  =4

    val maxResult = if (a>b){
        a
    }else{
        b
    }
    println(maxResult)


    // when statement it's similar to switch statement
    val  x = 10

    when(x){
        1,2,3,4 -> println("x is 1,2,3,4")
        6 -> println("x is 2")
        7 -> {
            println("x is 3")
            println("it's a even number")
        }
        else -> println("x value is unknown")
    }




}
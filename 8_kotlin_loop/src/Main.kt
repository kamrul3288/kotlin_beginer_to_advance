fun main(args: Array<String>) {


    //---------------FOR LOOP------------------

    for (i in 1..10){
        println("for loop: $i")
    }


    //---------------while loop-----------------
    var a = 0
    while (a<=10){
        println("while loop: $a")
        a++
    }

    //------------do while loop--------------------
    var b = 0
    do {
        println("do while loop: $b")
        b++
    }while (b<=10)
}
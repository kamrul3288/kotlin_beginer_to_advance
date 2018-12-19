fun main(args: Array<String>) {


    //---- break------------------
    for (i in 1..5){
        if (i==2){
            break
        }
        println(i)
    }

    //---- continue------------------
    for (i in 1..3){
        if (i==2){
            continue
        }
        println(i)
    }

    //---------outer----------------
    MyLoop@ for (i in 1..3){
        for (j in 1..3){

            if (i == 2 && j == 2){
                break@MyLoop
            }
            println("$i $j")
        }
    }

}
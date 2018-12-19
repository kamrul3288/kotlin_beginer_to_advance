fun main(args: Array<String>) {
    maximumValue(1,2)
}


fun maximumValue(var1:Int, var2:Int):Int =
        if (var1>var2){
            println("$var1 is greater")
            var1
        }else{
            println("$var2 is greater")
            var2
        }
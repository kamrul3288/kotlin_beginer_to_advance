fun main(args: Array<String>) {

    /*
    * CLOSURE
    * In java 8, you can not mutate (change) values of outside variable inside lamda
    * But in kotlin you can change it
    **/

    var result:Int = 0

    addTwoNumber(30,10,{x:Int, y:Int -> result = x + y})
    println(result)


}


fun addTwoNumber(a:Int, b:Int, action: (Int,Int)->Unit){
    action(a,b)
}
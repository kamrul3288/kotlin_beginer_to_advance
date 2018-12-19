/*
*todo Immutable Collections: Read only operation
* Immutable List: listOf
* Immutable Map: mapOf
* Immutable set: setOf
*
*
* todo Mutable Collection: Read and Write Both
* Mutable List: ArrayList, arrayListOf, mutableListOf
* Mutable Map: HashMap , hashMapOf, mutableMapOf
* Mutable Set: mutableSetOf, hashSetOf
*
**/
fun main(args: Array<String>) {

    //-------------Array-------------------------
    val myArray = Array<Int>(5){0}
    myArray[2] = 5
    for (i in myArray){
        println(i)
    }


    //--------------Array List---------------------
    val myArrayList = listOf<String>("Kamrul","Habib","Akash") //Immutable
    for (i in 0..myArrayList.size - 1){
        println(myArrayList[i])
    }


    val myArrayList1 = ArrayList<String>() //mutable
    myArrayList1.add("Kamrul")
    for (i in 0..myArrayList1.size - 1){
        println(myArrayList1[i])
    }







}


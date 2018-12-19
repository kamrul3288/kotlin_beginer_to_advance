fun main(args: Array<String>) {
    //Ranges

    var r1 = 1..5 // this range contain the number 1,2,3,4,5

    var r2 = 5 downTo 1 //this range contain the number 5,4,3,2,1

    var r3 = 1..5 step 2 //this range contain the number 1,3,5

    var r4 = 5 downTo 1 step 2 //this range contain the number 5, 3, 1



    var r5  = 'a'..'z' //this range contain the latter a,b,c,d...z

    var isPresent = 'a' in r5 // a char is present in r5 range, it's always return true or false

    var r6 = 1.rangeTo(10);
    var r7 = 10.downTo(1);
}
class Student(var name:String) {

    private var id:Int = -1;

    constructor(name: String, id:Int):this(name){
        this.id = id;
    }

    fun getStudentName():String{
        return name
    }

    public fun getStudentId():Int{
        return id
    }
}
package work.space

open class BaseClass{
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4 // public by default

    private fun access(){
        // Cannot access private class variables in function
//        private var m = a
    }
}

class SubClass: BaseClass(){
//Cannot access private variables in extended class
//    var sub = a

//Can access protected and Internal in extended class
    var sub = b
}

class AnotherClass(var z: BaseClass){
    fun getMembers(){
// Cannot access variables a and b of BaseClass using instance z.
//        z.a
//        z.b

// Can access variables c and d of BaseClass
        z.c
        z.d
    }
}

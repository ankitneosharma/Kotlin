package work.space

fun main(args: Array<String>){
    var samsung = SamSung()
    println(samsung.brand)
//    samsung.playVideo()

//    var nokia = Nokia()
//    nokia.playVideo()
}

//Rule1: Method must have same name and same parameter as in parent class
//Rule2: Overridable members must be marked with open keyword
//RUle3: add override keyword before override method
//Rule4: add super to call the super class function from child class

// super class
open class Phone{
    open var brand = "Phone"
    var price = 0

    open fun playVideo(){
        println("Phone is playing video")
    }
}

// child class of phone
class SamSung: Phone(){
    override var brand = "Samsung"
    override fun playVideo(){
        super.playVideo()
        println("Samsung is playing video")
    }
}

// child class of phone
class Nokia: Phone(){
    override fun playVideo(){
        println("Nokia is playing video")
    }
}

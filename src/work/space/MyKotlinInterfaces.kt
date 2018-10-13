package work.space

//Multiple inheritence is not possible with abstract class but its possible with Interface
//what ever you write interface is open by default and method with no body are abstract by default

fun main(args: Array<String>){
    var button = Button()
    button.click()
}
interface ClickListner{

    var totalClicks: Int
    fun click(){
        println("click from ClickListener")
    }
    fun countClick(){
        println("Count total clicks")
    }
}
interface TouchListner{
    fun click(){
        println("clicked from TouchListener")
    }
}

//Class Button ca implement 2 interfaces but it will not be able to implement 2 abstract classes
//open class A()
//open class B()
//class Button: A(), B()

class Button: ClickListner, TouchListner{
    override var totalClicks: Int = 2
    override fun click() {
        //you need to give name of the interface of impelmenting method when there are multiple occurences
        super<ClickListner>.click()
        println("Click Button")
    }

    override fun countClick() {
        super.countClick()
        println("counting total clickssssssss")
    }
}

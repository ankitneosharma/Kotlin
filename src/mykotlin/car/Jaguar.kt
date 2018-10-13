package mykotlin.car
import mykotlin.human.drive as humanDrive
import mykotlin.car.drive

// if no package is defined then this file belongs to a default package

fun main(args: Array<String>){

    var car = Car()

    drive()
    humanDrive()
}

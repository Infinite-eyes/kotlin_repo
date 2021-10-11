package properties.observable

import kotlin.properties.Delegates


class C{
    var age: Int by Delegates.vetoable(0){ property, oldValue, newValue ->
        println("oldValue = $oldValue -> oldValue = $newValue" )
        newValue > oldValue
    }
}

fun main(){
    var c = C()

    c.age = 5
    println(c.age)

    c.age = 10
    println(c.age)

    c.age = 8
    println(c.age)

    c.age = 20
    println(c.age)


}
package properties.observable

import kotlin.properties.Delegates

class Lazy {

    var a: String by Delegates.observable("默认值") { property, oldValue, newValue ->
        println("$oldValue -> $newValue ")
    }
}

fun main(){
    var lazy = Lazy()
    lazy.a = "第一次修改"
    lazy.a = "第二次修改"
}
import kotlin.reflect.KProperty


//V1
//class B{
//    var a: String by Text()
//}
//
//class Text{
//    operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
//        return "属性拥有者 = $thisRef,属性的名字 = '${property.name}' 属性的值"
//    }
//
//    operator fun setValue(thisRef: Any?, property: KProperty<*>,value:String){
//        println("属性的值 = $value 属性的名字 = '${property.name}' 属性拥有者 = $thisRef")
//    }
//}
//
//
//fun main(){
//    var b = B()
//    println(b.a)
//    b.a = "ahaha"
//}



//v2
class B{
    var a: String by Text()
}

class Text{
    var a: String= "初始值"
    operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
        return a
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>,value:String){
       a = value
    }
}


fun main(){
    var b = B()
    println(b.a)
    b.a = "ahaha"
    println(b.a)
}
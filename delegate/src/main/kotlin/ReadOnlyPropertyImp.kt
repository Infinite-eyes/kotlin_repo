import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Text1 : ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return "属性拥有者 = $thisRef, 属性的名字 = '${property.name}' 属性的值 "
    }
}


class Text2: ReadWriteProperty<Any,String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return "属性拥有者 = $thisRef, 属性的名字 = '${property.name}' 属性的值 "
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("属性的值 = $value 属性的名字 =  '${property.name}' 属性拥有者 =  $thisRef")
    }
}

class B2{

    val b: String by Text1()

    val c: String by Text2()
}
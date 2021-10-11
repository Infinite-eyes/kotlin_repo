package properties.map

class D(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main() {
    var d = D(mapOf("name" to "小明", "age" to 12))
    println("name = ${d.name},age = ${d.age}")
}
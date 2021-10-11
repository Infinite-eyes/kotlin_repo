package properties.lazy

class LazyTest {

    val name: String by lazy{
//        println("第一次调用初始化")
        println("1111")
        "aa"
    }

}


fun main(){
    var lazy = LazyTest()
    println(lazy.name)
    println(lazy.name)
    println(lazy.name)
}
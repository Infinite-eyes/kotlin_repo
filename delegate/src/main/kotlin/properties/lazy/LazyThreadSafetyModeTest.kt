package properties.lazy

class LazyThreadSafetyModeTest {


    /**
     *  SYNCHRONIZED:添加同步锁，使lazy延迟初始化线程安全
     *  PUBLICATION：初始化的lambda表达式，可以在同一时间多次调用，但是只有第一次的返回值作为初始化值
     *  NONE：没有同步锁，非线程安全
     */
    val name: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
//        println("第一次调用初始化")
        println("1111")
        "aa"
    }

}


fun main() {
    var lazy = LazyTest()
    println(lazy.name)
    println(lazy.name)
    println(lazy.name)
}
//类委托 https://juejin.cn/post/7016507751094288398

interface Base {
    fun text()
}


class BaseImpl(val x:String): Base{
    override fun text(){
        println(x)
    }
}

class Devices(b:Base): Base by b

fun main(){
    var b = BaseImpl("我是真实的类")
    Devices(b).text()
}
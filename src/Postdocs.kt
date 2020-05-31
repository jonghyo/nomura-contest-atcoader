fun main(args: Array<String>) {
    postdocs()
}

inline fun postdocs(){
    val s = readLine()!!
    println(s.replace("?", "D"))
}

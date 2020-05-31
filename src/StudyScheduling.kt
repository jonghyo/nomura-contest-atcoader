fun main(args: Array<String>) {
    studyscheduling()
}

inline fun studyscheduling(){
    val list = readLine()!!.split(" ").map(String::toInt)
    val (h1, m1, h2, m2, k) = list

    val t1 = h1 * 60 + m1
    val t2 = h2 * 60 + m2
    val diff = t2 - t1
    val answer = diff - k
    println(answer)
}

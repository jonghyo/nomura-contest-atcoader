fun main(args: Array<String>) {
    folia()
}

inline fun folia(){
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map(String::toInt)
    var answer = 0
    if(list[0] > 0){
        answer = -1
    }

    if(answer != -1){
        var answerA = 0
        var answerB = 0
        var nextNode = 0
        list.reversed().forEachIndexed{
                index, a ->
            println("index:${index}:${a}")
            println(answer)
            if(a > Math.pow(2.0, (n - index).toDouble()).toInt()) {
                answer = -1
                return@forEachIndexed
            } else if(index == n){
                answer += 1
                return@forEachIndexed
            }

            answer += a + nextNode
            if(a <= Math.pow(2.0, (n - index).toDouble()).toInt()){
                nextNode = a
            }else{
                if(a % 2 == 0){
                    nextNode = a/2
                }else{
                    nextNode = a/2 + 1
                }
            }
        }
    }
    println(answer)
}

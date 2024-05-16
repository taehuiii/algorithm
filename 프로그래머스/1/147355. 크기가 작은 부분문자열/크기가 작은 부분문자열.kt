class Solution {
    fun solution(t: String, p: String): Int {
        var temp: String =""
        var tLength = t.length
        var pLength = p.length
        var cnt = tLength-pLength +1
        var cmp=0.0
        var answer=0

      
        // var tInt = t.toULong()
        var pInt = p.toDouble()
        

        var tIntArr = t.chunked(1).map{it.toULong()}

        for( j:Int in 0..cnt-1) {
            temp=""
            for (i: Int in j..j+pLength - 1) {
                temp += tIntArr[i].toString()
            }
            cmp = temp.toDouble()

            if ( cmp <= pInt){
                answer++
            }
        }
        return answer
    }
}
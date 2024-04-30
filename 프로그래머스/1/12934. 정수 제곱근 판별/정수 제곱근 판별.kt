import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val num = n.toDouble()
        
        if( (sqrt(num) - sqrt(num).toLong())==0.0 ){
            answer = (sqrt(num)+1).pow(2.0).toLong()
        }else{
            return -1
        }
        
        return answer
    }
}
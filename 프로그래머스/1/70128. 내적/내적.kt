class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        for( i :Int in 0 until a.size){
            answer += a[i] * b[i]
        }
        return answer
    }
}
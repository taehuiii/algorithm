class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()
        var i:Int =0
        var xnum:Long = x.toLong()
        
        while(i<n){
            answer.add(xnum)
            xnum+=x.toLong()
            i++
        }
        return answer.toLongArray()
    }
}
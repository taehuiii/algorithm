class Solution {
    fun solution(n: Long): IntArray {
       
        
        var str = n.toString()
        var len = str.length
      
        var num : Long = n 
        var answer = IntArray(len)
      
        
        for ( i in 0 until len){
         answer[i] = (num % 10).toInt()
        num = num/ 10
        }
      
        return answer
    }
}
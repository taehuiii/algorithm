class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var i:Int=2
        
        while(true){
            
            if(n%i==1){
                return i
            }
            i++
        }
        
        
        return answer
    }
}
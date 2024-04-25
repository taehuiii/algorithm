class Solution {
    fun solution(n: Int): Int {
     
        var i:Int =n
        var sum:Int=0

        while(i>0){
            if(n % i ==0){
                sum += i
            }
            i--
        }
        
        return sum
    }
}
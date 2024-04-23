class Solution {
    fun solution(angle: Int): Int {
        var answer : Int =0
        
        when ( angle ){
           in 0 until 90 ->{ answer=1}
            90 -> {answer=2}
           in 91 until 180 ->{answer=3}
            180 -> {answer=4}
        }
       
        return answer
    }
}
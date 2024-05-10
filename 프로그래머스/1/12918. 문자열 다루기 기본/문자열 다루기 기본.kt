class Solution {
    fun solution(s: String): Boolean {
        var answer1 = false
        answer1 = s.chars().allMatch { Character.isDigit(it) }
        
        var answer2 = false
        if( s.length ==4 || s.length ==6){ answer2 = true}
        
       var answer :Boolean= answer1 && answer2
        return answer
    }
}
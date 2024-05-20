class Solution {
    fun solution(s: String): Boolean {
      
        if( s.all{it.isDigit()} && (s.length==4 || s.length==6)){
            return true
        }
        return false
    }
}
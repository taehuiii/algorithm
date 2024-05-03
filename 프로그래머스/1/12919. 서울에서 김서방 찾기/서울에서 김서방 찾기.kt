class Solution {
    fun solution(seoul: Array<String>): String {
        var location :Int =0
        var answer = ""

        seoul.forEachIndexed{index, it ->
            if( it =="Kim"){ location =index}
        }
        
       
        answer = "김서방은 ${location.toString()}에 있다"

        return answer
    }
}
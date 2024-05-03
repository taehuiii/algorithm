class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var len = phone_number.length
        var end = phone_number.length-4
        
        for(i:Int in 0 until end){
            answer += "*"
        }
        
        for(j:Int in end until len){
            answer += phone_number[j]
        }


        return answer
    }
}
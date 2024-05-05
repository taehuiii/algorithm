class Solution {
    fun solution(s: String): String {
         var answer = ""
        var len = s.length
        var index =0
        index = len/2
      
        
        if( len %2 ==0){
            answer +=s[index-1]
            answer +=s[index]
        }else{
            answer +=s[index]
        }
        
        return answer
    }
}
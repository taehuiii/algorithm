class Solution {
    fun solution(s: String): String {
   
        var answer = ""
        var tempList : MutableList<String> = mutableListOf()
        var tempArr=""

       tempList = s.split(" ").toMutableList()

        tempList.forEachIndexed { index, s ->  
            
            s.forEachIndexed { index, c ->
                if( index %2 ==1){ tempArr += c.lowercaseChar() 
                }else{ tempArr += c.uppercaseChar() }
            }
            answer += tempArr
               
          //  if(index != tempList.size-1){ answer += " "}
            tempArr=" "
            
            
        }


        return answer
}}
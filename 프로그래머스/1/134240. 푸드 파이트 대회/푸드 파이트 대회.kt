class Solution {
    fun solution(food: IntArray): String {
      
        var answer = ""

        food.forEachIndexed { index, i ->
            if(index!=0){
                for( k:Int in 1..i/2){
                    answer+= "${index}"
                }
            }
        }
        answer+="0"

        var temp = ""


        answer.reversed().forEach{ c ->
            if (c!= '0'){
                temp+=c
            }
        }

     



        return answer+temp
    }
}
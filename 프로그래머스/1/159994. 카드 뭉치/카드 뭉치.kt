class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        
       var i =0
        var k=0
        var temp = mutableListOf<String>()
        var cmp = goal.toMutableList()

        goal.forEach{
            if(i < cards1.size && it==cards1[i]  ){
                i++
            }else if(k < cards2.size && it==cards2[k] ){
                k++
            }else{
                return "No"
            }

            
        }
        return "Yes"
            
    }
}
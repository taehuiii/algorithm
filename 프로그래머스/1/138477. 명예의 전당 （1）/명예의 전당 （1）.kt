class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
         
        var answer= mutableListOf<Int>()
        var scores = mutableListOf<Int>()

        for( i:Int in 0..score.lastIndex){
            scores.add(score[i])
            scores.sortDescending()
            if( i in 0..k-1){
                 var temp = scores.reversed()
                answer.add(temp.component1())}
            else{
                answer.add(scores[k-1])
            }
        }


        return answer.toIntArray()
    }
}
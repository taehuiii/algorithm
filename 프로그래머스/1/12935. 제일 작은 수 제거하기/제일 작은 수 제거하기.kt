class Solution {
fun solution(arr: IntArray): IntArray {
        var answer : IntArray = arr
        

        if(arr.size == 1){
            answer[0]= -1
            return answer
        }

        var min:Int =answer[0]

        answer.forEach{
            if(it < min){
                min = it
            }
        }

       //answer.toMutableList().remove(min)
        var temp = answer.toMutableList()
        temp.remove(min)

        return temp.toTypedArray().toIntArray()
    }}
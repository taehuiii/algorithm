class Solution {
    fun solution(s: String): IntArray {
  var answer: IntArray = IntArray(s.length)

        s.forEachIndexed { index, c ->

           if (s.substring(0 until index).contains(c)){
                answer[index] = index - s.substring(0 until index).lastIndexOf(c)
           }else{
               answer[index] =-1
           }
        }
        return answer
    }
}
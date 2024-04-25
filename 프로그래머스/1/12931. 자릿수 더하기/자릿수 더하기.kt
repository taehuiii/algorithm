import kotlin.math.pow
class Solution {
    fun solution(n: Int): Int {
 
              var num = n
            var answer : Int = 0


            var str:String=n.toString()
            var len:Int =str.length

            for (j: Int in len-1 downTo 0 ){
                answer += (num/(10.0.pow(j))).toInt()
                num = (n%(10.0.pow(j))).toInt()
            }




            return answer
    }
}
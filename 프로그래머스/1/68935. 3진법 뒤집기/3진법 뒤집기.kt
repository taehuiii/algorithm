import kotlin.math.pow
class Solution {
    fun solution(n: Int): Int {
        var answer: Double = 0.0
            var temp =n
            var temparr =""
            var arrlength =0

            while(true){
                temparr += (temp %3).toString()
                temp /= 3
                if(temp ==0){ break}
            }


            arrlength = temparr.length
            var tempChar = temparr.toCharArray()

            for( j :Int in 0..arrlength-1){

                answer += (3.0.pow(j.toDouble())) * tempChar[arrlength-1-j].toString().toInt()

                var h = 3.0.pow(j.toDouble())
                var l = temparr[arrlength-1-j].toDouble()
            }

            return answer.toInt()
    }
}
    class Solution {
        fun solution(a: Int, b: Int): Long {
            var answer: Long = 0

            var m=a
            var n=b

            if( a>b){
                m=b
                n=a
            }

            for( i : Int in m..n){
                answer +=i
            }
            return answer
        }
    }

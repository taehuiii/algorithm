
     class Solution {
        fun solution(numbers: IntArray): Int {
            var answer: Int = 0

            for( i :Int in 0 ..9){
                if( numbers.contains(i)){
                    continue
                }
                answer += i
            }


            return answer
        }
    }

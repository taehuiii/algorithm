class Solution {
        fun solution(absolutes: IntArray, signs: BooleanArray): Int {
            var answer: Int =0

            signs.forEachIndexed{ index, it ->
                if (it == false) {
                    absolutes[index] *= (-1)
                }
            }
            absolutes.forEach { answer += it }


            return answer
        }
    }
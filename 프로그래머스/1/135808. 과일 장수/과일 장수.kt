class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var scores = score.toMutableList().sortedDescending()
        var boxs = Array( score.size/m){ mutableListOf(m) }

        boxs.forEachIndexed{ index, it->
            boxs[index] = scores.slice(index*m until (index+1)*m).toMutableList()
            answer += boxs[index][m-1] * m
        }
        return answer
    }
}
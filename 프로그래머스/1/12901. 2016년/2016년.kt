class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        var months = intArrayOf(31,29,31,30,31,30,31,31,30,31,30,31)
        var days =0

        for(i :Int in 0 until a-1){
            days += months[i]
        }
        days += b
        days %= 7

        answer = when(days){
            0 -> "THU"
            1-> "FRI"
            2-> "SAT"
            3->"SUN"
            4->"MON"
            5->"TUE"
            6->"WED"
            else -> "error"
        }
        return answer
    }
}
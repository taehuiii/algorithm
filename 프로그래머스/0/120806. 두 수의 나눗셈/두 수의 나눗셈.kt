class Solution {
    fun solution(num1: Int, num2: Int): Int {
    val temp = num1.toDouble() /num2
    return (temp*1000).toInt()
}
}
class Solution {
    fun solution(num: Int): Int {
       var temp: Long = num.toLong()
    var count = 0

    if (num == 1) {
        return 0
    }

    while (temp != 1L) {

        if (temp % 2 == 0L) {
            temp /= 2

        } else {
            temp = (temp * 3) + 1
        }

        count++

        if (count == 500) {
            return -1
        }

    }

    return count
    }
}
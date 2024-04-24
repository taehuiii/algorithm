class Solution {
    fun solution(n: Int): Int {
        var sum :Int =0
        var temp:Int = n
        while (temp >0 ){
            if( temp %2 ==0){
                sum +=temp
            }
            temp--;
        }
        return sum
    }
}
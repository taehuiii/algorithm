class Solution {
    fun solution(x: Int): Boolean {
        var answer = true

        var sum = 0
        var len = x.toString().length
        var num = x

        for(i:Int in 0 until len){
            sum += (num%10)
            num /= 10
        }

        answer = x %sum ==0

//        if( x %sum ==0){
//            answer = true
//        }else{
//            answer = false
//        }


        return answer
    }
}
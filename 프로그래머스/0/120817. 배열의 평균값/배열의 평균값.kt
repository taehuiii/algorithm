class Solution {
    fun solution(numbers: IntArray): Double {
        
        var length:Int = numbers.count()
        var answer: Double = 0.0
        var sum :Double =0.0
       
        
        while(length >0){
            sum += numbers[length-1]
            length--;
        }
        
        answer = sum/numbers.count()
        
      
        return answer
    }
}
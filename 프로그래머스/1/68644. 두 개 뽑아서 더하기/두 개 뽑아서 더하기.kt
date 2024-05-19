class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer=mutableSetOf<Int>()
        
        var temp =0
    
        
        var indexN = numbers.size-1
     
        
        for( i :Int in 0..indexN){
            for (j:Int in i+1..indexN){
                temp = numbers[i] + numbers[j]
                if( temp in answer){ continue}
                else{ answer.add(temp)
               }
                
            }
        }
        
        return answer.sorted().toIntArray()
    }
}
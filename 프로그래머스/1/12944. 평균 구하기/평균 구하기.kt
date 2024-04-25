class Solution {
    fun solution(arr: IntArray): Double {
        
        var result:Double =0.0
        var length = arr.count()
        
        while( length>0){
            result += arr[length-1]
            length--
        }
        result = result/arr.count()
        
    
        return result
    }
}
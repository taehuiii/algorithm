class Solution {
    fun solution(number: IntArray): Int {
        
        var cnt =0
        var arrlength = number.size-1
        
        for ( i :Int in 0..arrlength-2){
            for (j:Int in i+1 .. arrlength){
                for(k:Int in j+1 ..arrlength){
                    if( number[i]+number[j]+number[k] == 0){ cnt++}
                }
                
            }
        }
        return cnt
    }
}
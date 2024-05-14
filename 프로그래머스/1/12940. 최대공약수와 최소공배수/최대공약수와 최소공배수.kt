class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(0,0)
        var small =n
        var big = m
        
 
        
        if( n > m ){ 
            small = m
            big = n }
        
        for ( i :Int in 1 ..small){
            
            if( (small % i ==0) && (big%i==0)){
                answer[0] = i
            }
        }
        
        var j=1
        while(true){
            if( big % small ==0){ answer[1] = big; break;}
            else{
                if( (big *j)%small ==0){
                    answer[1] = big*j
                    break
                }
            }
            j++
        }
        
    
        
        return answer
    }
}
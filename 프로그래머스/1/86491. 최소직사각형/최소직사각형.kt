class Solution {
    fun solution(sizes: Array<IntArray>): Int {
      var answer: Int = 0
        var cardNum = sizes.size

        var max =0
        var maxIndex =0
        var max2 =0

        //max, max index 구하고
       for( i :Int in 0.. sizes.size-1){
           for(j:Int in 0..1){
               if( max < sizes[i][j]){
                   max =sizes[i][j]
                   maxIndex = j
               }
           }
       }

        var temp =0
        //인덱스맞게 큰수 위치 스위치
        for( i :Int in 0.. sizes.size-1){
                if( maxIndex==0){
                    if( sizes[i][1] > sizes[i][0] ){ 
                        temp = sizes[i][1]
                        sizes[i][1] =sizes[i][0]
                        sizes[i][0] = temp
                    }
                    if( max2 <sizes[i][1] ){max2 =sizes[i][1] }
                }else {
                    if (sizes[i][1] < sizes[i][0]) {
                        temp = sizes[i][1]
                        sizes[i][1] = sizes[i][0]
                        sizes[i][0] = temp
                    }
                    if( max2 <sizes[i][0] ){max2 =sizes[i][0] }
                }
            }
    

        //반대편 index에서 max구하기




        return max*max2
    }
}
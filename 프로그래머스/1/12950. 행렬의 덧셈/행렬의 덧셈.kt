class Solution {
        fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            var answer = Array(arr1.size){IntArray(arr1[0].size){0} }


            for ( (i,row) in arr1.withIndex() ){
                for( (j) in row.withIndex()){

                    answer[i][j] = arr1[i][j] + arr2[i][j]
                }
            }
            return answer
        }
    }
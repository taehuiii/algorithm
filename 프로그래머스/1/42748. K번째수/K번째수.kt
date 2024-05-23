class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
      var answer = mutableListOf<Int>()
            var tempList = mutableListOf<List<Int>>()

            commands.forEachIndexed { index,it ->
                tempList.add( array.slice(it[0]-1..it[1]-1).sorted())
                answer.add( tempList[index][it[2]-1])
            }


            return answer.toIntArray()
    }
}
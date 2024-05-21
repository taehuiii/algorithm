class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
         var arrList = strings.toMutableList()
        var charMap:MutableMap<String,Char> = mutableMapOf()

        arrList.forEach{ it->
            it.forEachIndexed { index, c ->
                if(index==n){charMap[it] = c}
            }
        }

        var tempMap = charMap.toList().sortedWith(compareBy({it.second},{it.first})).toMap().toMutableMap()
        
        tempMap.keys.toTypedArray()

        return tempMap.keys.toTypedArray()
    }
}
class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        var temp = money.toLong()
        
        for (i:Int in 1 .. count){
            temp -= price.toLong()*i
        }
        
        if(temp >=0){ return 0
        }else{temp *= -1
        answer = temp.toLong()
        return answer}
       
        
    }
}
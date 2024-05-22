class Solution {
    fun solution(s: String, n: Int): String {
          var str:String =""

        s.forEach {
            if( it in 'A' ..'Z'){
                if( it+n <= 'Z') {str += it+n
                }else{
                    str += ( it+n-26)
                }
            }else if( it in 'a' ..'z'){
                if( it+n <= 'z') {str += it+n
                }else{
                    str += ( it+n-26)
                }
            }else if(it == ' '){
                str +=' '
            }
        }

        return str

    }
}
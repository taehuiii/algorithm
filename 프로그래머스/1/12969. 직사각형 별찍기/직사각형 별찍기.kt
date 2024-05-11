fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    
    for ( m:Int in 1..b){
        for( n:Int in 1..a){
            print("*")
        }
        println()
    }
    
}
 fun sumZero(n: Int): IntArray {
        var result= mutableListOf<Int>()
        if (n == 0) {
            result.add(0)
            return result.toIntArray()
        }
        if (n%2!=0){
            result.add(0)
            for (i in 1 .. n-1 step 2 ){
                result.add(i)
                result.add(-i)
        }}else{
            for (i in 1..n-1 step 2){
                result.add(i)
                result.add(-i)
        }}
        return result.toIntArray()
    }
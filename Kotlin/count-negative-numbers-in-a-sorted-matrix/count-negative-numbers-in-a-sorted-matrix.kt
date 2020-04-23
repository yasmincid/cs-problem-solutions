fun countNegatives(grid: Array<IntArray>): Int {
         var count = 0
        for (i in grid) {
            for(l in i){
            if (l<0)
                count++
        }}
        return count
    
    }
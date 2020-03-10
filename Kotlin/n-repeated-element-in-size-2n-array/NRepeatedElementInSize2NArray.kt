fun repeatedNTimes1(A: IntArray): Int {
    var mymap = HashMap<Int, Int>()
    var result = 0
    for (i in 1..A.size) {
        val temp = A.get(i)
        if (mymap.containsKey(temp) == false) {
            mymap.put(temp, 1)
        } else {
            result = temp

        }
    }
    return result
}

fun repeatedNTimes(A: IntArray): Int {
    var setMap = HashSet<Int>()
    var result = 0
    for (i in 0 until A.size - 1) {
        if (setMap.contains(A[i]) == false) {
            setMap.add(A[i])
        } else {
            result = A[i]
            break
        }
    }
    return result
}
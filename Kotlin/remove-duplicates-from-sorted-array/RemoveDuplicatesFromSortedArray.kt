fun removeDuplicates2(nums: IntArray): Int {
    if (nums.size == 0)
        return 1
    var auxMap = HashSet<Int>()
    var list = ArrayList<Int>()
    for (key in nums) {
        if (!auxMap.contains(key)) {
            auxMap.add(key)
            list.add(key)
        }
    }
    for (n in 0..list.size - 1)
        nums[n] = list.get(n)
    return auxMap.size
}


fun removeDuplicates1(nums: IntArray): Int {
    if (nums.size == 1)
        return 1
    var array = ArrayList<Int>()
    for (i in nums) {
        if (!array.contains(i))
            array.add(i)

    }
    for (n in 0..array.size - 1)
        nums[n] = array.get(n)
    for (n in nums)
        println(n)
    return array.size
}
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    var myHashSet = HashSet<Int>()
    for (i in 0 until nums1.size - 1) {
        for (j in 0 until nums2.size - 1) {
            if (nums1[i] == nums2[j]) {
                if (!myHashSet.contains(nums1[i])) {
                    myHashSet.add(nums1[i])
                }
            }

        }
    }

    val array = myHashSet.toIntArray()
    return array
}

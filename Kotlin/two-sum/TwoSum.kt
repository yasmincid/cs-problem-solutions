import java.util.ArrayList

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var myArray = ArrayList<Int>()
    for (i in 0..numbers.size - 2) {
        for (j in i + 1..numbers.size - 1) {
            if (numbers[i] + numbers[j] == target) {
                myArray.add(i + 1)
                myArray.add(j + 1)
                break
            }
        }
    }
    for (n in myArray)
        println(n)
    return myArray.toIntArray()
}
fun numberOfSteps(num: Int): Int {
    var cont = 0
    var temp = num
    while (temp > 0) {
        if (temp % 2 == 0) {
            temp = divide(temp)
            cont++

        } else {

            temp = rest(temp)
            cont++

        }
    }

    return cont
}

fun divide(num: Int): Int {
    return num / 2
}

fun rest(num: Int): Int {
    return num - 1
}
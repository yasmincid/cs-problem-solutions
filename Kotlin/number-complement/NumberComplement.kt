fun findComplement(num: Int): Int {
    var result = 0
    if (num == 1)
        return 1
    var temp = reverseBinary(num)
    var x = temp.toCharArray()
    var cont = x.size - 1
    for (i in 0 until x.size) {
        var characterActual = x.elementAt(i)
        var potencia = Math.pow(2.toDouble(), cont.toDouble()).toInt()
        if (characterActual == '1')
            result += potencia
        cont--
    }
    return result
}
fun reverseBinary(num: Int): String {
    var myBynary = Integer.toBinaryString(num)
    var temp = ""
    for (byte in myBynary) {
        if (byte == '0') {
            temp = temp + '1'
        } else {
            temp = temp + '0'
        }
    }
    return temp
}
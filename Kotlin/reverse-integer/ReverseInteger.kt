un reverse(x: Int): Int {
    var cadena = x.toString()
    var aux = ""
    if (cadena.get(0) == '-') {
        cadena = cadena.substring(1, cadena.length)
        aux += "-"
    }
    if (cadena.get(cadena.length - 1) == '0') {
        cadena = cadena.substring(0, cadena.length - 1)
    }
    for (i in cadena.length - 1 downTo 0)
        aux += cadena.get(i)
    try {
        var e = aux.toInt()
        println(e)
        return e
    } catch (E: NumberFormatException) {
        return 0
    }
}
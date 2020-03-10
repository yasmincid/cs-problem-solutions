fun subtractProductAndSum(n: Int): Int {

    var resul = n / 10
    var resto = n % 10
    var sum = 0
    var multi = 1
    do {
        println(resto)
        println(resul)
        sum += resto
        multi *= resto

        resto = resul % 10
        resul /= 10

    } while (resul > 0)
    sum += resul
    multi *= resul
    println(sum)
    println(multi)
    val dif = multi - sum
    println(dif)
    return dif
}

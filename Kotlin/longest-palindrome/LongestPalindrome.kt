fun longestPalindrome(s: String): Int {
    var Palindrome = HashMap<Char, Int>()
    var result = 0
    var bandera = false
    if (s.length == 1)
        return 1
    for (a in 0..s.length - 1) {
        var t = s.elementAt(a)
        if (!Palindrome.containsKey(t)) {
            Palindrome.put(t, 1)
        } else {
            var count = Palindrome.get(t)!!
            Palindrome.put(t, count + 1)
        }

    }
    for (u in Palindrome) {
        if (u.value % 2 == 0) {
            result += u.value
        } else {
            bandera = true
            result += u.value - 1
        }
    }
    if (bandera == true) {
        result += 1
    }
    return result
}

public boolean isPalindrome(int x) {
        boolean var;
        String t = Integer.toString(x);
        String aux = "";
        if (t.charAt(0) == '-') {
            var = false;
        } else {
            for (int i = t.length() - 1; i >= 0; i--) {
                aux = aux + t.charAt(i);
            }
            if (!t.equals(aux)) {
                var = false;
            } else {
                var = true;
            }
        }
        return var;
    }
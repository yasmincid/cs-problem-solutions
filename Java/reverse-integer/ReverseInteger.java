public int reverse(int x) {
        String aux = "";
        int result;
        if (x < 0) {
            x *= -1;
            aux = "-";
        }
        String t = Integer.toString(x);
        for (int i = t.length() - 1; i >= 0; i--) {
            aux += t.charAt(i);
        }
        try {
            result = Integer.parseInt(aux);
            return result;
        } catch (NumberFormatException E) {
            return 0;
        }

    }
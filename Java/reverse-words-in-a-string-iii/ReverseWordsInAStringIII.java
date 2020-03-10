 public String reverseWords(String s) {
        if ((s == null) || (s.equals(""))) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        
        String[] var = s.split(" ");
        String result = "";
        for (int i = 0; i < var.length; i++) {
            StringBuilder builder = new StringBuilder(var[i]);
           var[i] = builder.reverse().toString();
            if (i == var.length - 1) {
                result += var[i];
            } else {
                result += var[i] + " ";
            }
        }
        System.out.println(result);
        return result;
    }
}
 public boolean isMonotomic(int[] A) {
        boolean bandera = false;
        int crec = 0;
        int decre = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= A[i + 1]) {
                decre++;
            }
        }
        if (decre == A.length - 1) {
            bandera = true;
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] <= A[i + 1]) {
                    crec++;
                }
            }
        }
        if (crec == A.length - 1) {
            bandera = true;
        }

        return bandera;

    }
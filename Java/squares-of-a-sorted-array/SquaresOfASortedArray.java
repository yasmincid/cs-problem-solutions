 public int[] sortedSquares(int[] A) {
        for (int i = 0; i <= A.length; i++) {
            for (int j = i + 1; j <= A.length - 1; j++) {
                if ((A[i] * A[i]) >= (A[j] * A[j])) {
                    int aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }

        }
        for (int i = 0; i <= A.length - 1; i++) {
            A[i] *= A[i];
            System.out.println(A[i]);
        }
        return A;

    }
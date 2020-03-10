public boolean uniqueOccurrences(int[] arr) {
        boolean bandera = true;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        HashMap<Integer, Boolean> otherMap = new HashMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (myMap.containsKey(arr[i]) == false) {
                myMap.put(arr[i], 1);
            } else {
                int contador = myMap.get(arr[i]);
                myMap.put(arr[i], contador + 1);
            }
        }
        Iterator<Integer> iterator = myMap.keySet().iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            int cont = myMap.get(numero);
            if (otherMap.containsKey(cont) == false) {
                otherMap.put(cont, false);
            } else {
                bandera = false;
                break;
            }
        }
        System.out.println(bandera);
        return bandera;
    }

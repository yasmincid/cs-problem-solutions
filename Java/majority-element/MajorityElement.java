public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int mayor = 0;
        int elemento = 0;
        for (int i = 0; i < nums.length; i++) {
            int numero = nums[i];
            if (myMap.containsKey(numero) == false) {
                myMap.put(numero, 1);
            } else {
                int contador = myMap.get(numero);
                myMap.put(numero, contador + 1);
                System.out.println(myMap);
            }
        }
        Iterator<Integer> iterator = myMap.keySet().iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            int contador = myMap.get(numero);
            if (contador >= mayor) {
                mayor = contador;
                elemento = numero;
            }

        }
       
        return elemento;
    }
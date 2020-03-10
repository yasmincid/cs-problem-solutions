 public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temporal = nums[i];
            if (mapa.containsKey(temporal) == false) {
                mapa.put(temporal, 1);
            } else {
                int contador = mapa.get(temporal);
                mapa.put(temporal, contador + 1);
            }
        }
        Iterator<Integer> iterator = mapa.keySet().iterator();
        while (iterator.hasNext()) {
            int temporal = iterator.next();
            int contador = mapa.get(temporal);
            if (contador == 1) {
                System.out.println("El numero " + temporal + " se repite una vez");
                return temporal;
            }
        }
        return 0;
    }
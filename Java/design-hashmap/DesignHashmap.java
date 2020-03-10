package hashmap;

import java.util.ArrayList;

/**
 *
 * @author yas
 */
public class myHashMap {

    ArrayList<mapa> array;

    public myHashMap() {
        array = new ArrayList<>();
    }

    public void put(int key, int value) {

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getLlave() == key) {
                array.get(i).setValor(value);
                return;
            }
        }
        mapa map = new mapa(key, value);
        array.add(map);

        for (int i = 0; i < array.size(); i++) {
            System.out.println("add llave" + array.get(i).getLlave() + "valor " + array.get(i).getValor());
        }
        return;
    }

    public int get(int key) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getLlave() == key) {
                System.out.println("get" + array.get(i).getValor());
                return array.get(i).getValor();

            }
        }
        System.out.println(-1);
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getLlave() == key) {
                array.remove(i);
                //return;
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println("remove llave" + array.get(i).getLlave() + "valor " + array.get(i).getValor());
        }
    }
}

class mapa {

    private int llave;
    private int valor;

    public mapa(int llave, int valor) {
        this.llave = llave;
        this.valor = valor;
    }

    /**
     * @return the llave
     */
    public int getLlave() {
        return llave;
    }

    /**
     * @param llave the llave to set
     */
    public void setLlave(int llave) {
        this.llave = llave;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

}

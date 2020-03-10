import java.util.ArrayList;

/**
 *
 * @author yas
 */
public class MyHashSet {

    private ArrayList<Integer> MyHashSet;

    public MyHashSet() {
        this.MyHashSet = new ArrayList<>();
    }

    public void add(int key) {
        for (int i = 0; i < this.MyHashSet.size(); i++) {
            if (this.MyHashSet.get(i)==(key)) {
                //System.out.println(i);
                return;
            }
        }
        this.MyHashSet.add(key);
        
            System.out.println("add");
        

    }

    public void remove(int key) {
        for (int i = 0; i < this.MyHashSet.size(); i++) {
            if (this.MyHashSet.get(i)==key) {
                this.MyHashSet.remove(i);
            }
        }

    }

    public boolean contains(int key) {
          for (int i = 0; i > this.MyHashSet.size(); i++) {
            System.out.println(this.MyHashSet.get(i));
        }
        boolean a = false;
        for (int i = 0; i < this.MyHashSet.size(); i++) {
            if (this.MyHashSet.get(i) == key) {
                a = true;

            }
        }
        System.out.println(a);
        return a;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Arrays extends Randomizer {
    ArrayList<Integer> arrayList = new ArrayList<>(30);
    LinkedList<Integer> linkedList = new LinkedList<>();
    int[] array = new int[100];

    public int[] getRandom() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30) - 15);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public ArrayList createArrayList() {
        getRandom();
        System.out.println(" ");

        for (int k = 0; k < array.length; k++) {
            if (array[k] > 0) {
                arrayList.add(array[k]);
            }
        }
        //showArrayList(arrayList);
        return arrayList;
    }

    public void addValues() {
        createArrayList();
        System.out.println(" ");

        int sizeOfArrayList = arrayList.size();

        for (int j = 0; j < sizeOfArrayList; j++) {
            arrayList.add(arrayList.get(j) * 10);
        }
        showArrayList(arrayList);
    }

    private void removeElements() {
        addValues();

        for (int h = 0; h < arrayList.size(); h++) {
            if (arrayList.get(h) < 10) {
                arrayList.remove(h);
            }
        }
        showArrayList(arrayList);
    }

    public void sortArrayList() {
        removeElements();

        Collections.sort(arrayList);
        showArrayList(arrayList);
    }

    private void showArrayList(ArrayList<Integer> arrayList) {
        for (int r = 0; r < arrayList.size(); r++) {
            System.out.print(arrayList.get(r) + " ");
        }
    }

    public void addInArrayList() {

        while (arrayList.size() <= 100000) {
            arrayList.add(((int) (Math.random() * 10000) - 10000));
            if (arrayList.size() == 100000) {
                break;
            }
        }
        System.out.println(arrayList);
    }

    public void arraySpeed() {
        addInArrayList();
        int i = 0;
        while (i <= 10000) {
            System.out.print((arrayList.get(random())));
            i++;
        }
    }

    public void addInLinkedList() {
        while (linkedList.size() <= 100000) {
            linkedList.add(((int) (Math.random() * 10000) - 10000));
            if (linkedList.size() == 100000) {
                break;

            }
        }
        System.out.println(linkedList);
    }

    public void linkedSpeed() {
        addInLinkedList();
        int i = 0;
        while (i <= 10000) {
            System.out.print(linkedList.get(random()));
            i++;
        }
    }
}
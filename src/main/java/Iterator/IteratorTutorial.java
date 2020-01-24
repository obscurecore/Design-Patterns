package Iterator;

import java.util.Iterator;

public class IteratorTutorial {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        SingleIterator s = new SingleIterator(arr);
        while (s.hasNext()) {
            Integer i = (Integer) s.next();
            System.out.println(i);
        }
    }
}

class SingleIterator implements Iterator {
    private int index = 0;

    public SingleIterator(Object[] objects) {
        this.objects = objects;
    }

    private Object[] objects;


    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public Object next() {
        return objects[index++];
    }
}

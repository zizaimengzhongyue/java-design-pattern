import java.util.ArrayList;

public class ItemList<T> {

    private ArrayList<T> items = new ArrayList<T>();
    private int index = 0;

    public void addItem(T item) {
        this.items.add(item);
    }

    public Iterator<T> getIterator() {
        return new ItemListIterator();
    }

    private class ItemListIterator implements Iterator<T> {
        public boolean hasNext() {
            return index < items.size();
        }

        public T next() {
            return items.get(index++);
        }
    }

}
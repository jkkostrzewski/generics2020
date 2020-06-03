package pl.p.lodz.zzpj2020.generics.exercises.one.list.unidirectional;

public class UnidirectionalList<T> {

    public Node<T> firstElement;

    public UnidirectionalList() {
        firstElement = null;
    }

    public void add(T e) {
        Node<T> currentElement = firstElement;
        if (firstElement == null) {
            firstElement = new Node<>(e);
        } else {
            while (currentElement.nextElement != null) {
                currentElement = currentElement.nextElement;
            }
            currentElement.nextElement = new Node<>(e);
        }
    }

    public Node<T> get(int index) throws IndexOutOfBoundsException {
        if (index == 0) return firstElement;

        Node<T> currentElement = firstElement;
        for (int i = 1; i <= index; i++) {
            if (currentElement.nextElement == null) {
                throw new IndexOutOfBoundsException();
            }
            currentElement = currentElement.nextElement;
        }
        return currentElement;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        int count = 0;
        Node<T> currentElement = firstElement;
        if (currentElement != null) {
            count++;
        } else {
            return 0;
        }
        while (currentElement.nextElement != null) {
            count++;
            currentElement = currentElement.nextElement;
        }
        return count;
    }

    public void removeAll() {
        firstElement = null;
    }

    public void displayElementAt(int index) {
        Node<T> element = get(index);
        System.out.println(element.content.toString());
    }

    public void displayList() {
        for (int i = 0; i < size(); i++) {
            displayElementAt(i);
        }
    }

    public void mergeList(UnidirectionalList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i).content);
        }
    }
}

package pl.p.lodz.zzpj2020.generics.exercises.one.list.unidirectional;

public class Node<T> {
    public T content;
    public Node<T> nextElement;

    public Node(T content) {
        this.content = content;
        nextElement = null;
    }
}

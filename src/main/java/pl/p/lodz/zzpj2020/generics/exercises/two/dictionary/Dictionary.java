package pl.p.lodz.zzpj2020.generics.exercises.two.dictionary;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary<K extends Term, V extends Definition> {
    TreeMap<K, V> dictionary;

    public Dictionary() {
        this.dictionary = new TreeMap<>();
    }

    public void add(K key, V value) {
        dictionary.put(key, value);
    }

    public void remove(K key) {
        dictionary.remove(key);
    }

    public V get(K key) {
        return dictionary.get(key);
    }

    public boolean containsKey(K key) {
        return dictionary.containsKey(key);
    }

    public int size() {
        return dictionary.size();
    }

    public void displayDictionary() {
        for (Map.Entry<K, V> e : dictionary.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public void mergeDictionary(Dictionary<K, V> dictionary) {
        this.dictionary.putAll(dictionary.getDictionary());
    }

    public TreeMap<K, V> getDictionary() {
        return dictionary;
    }
}

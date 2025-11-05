package lab4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * MyAList<E> - A custom list class that wraps around Java's ArrayList<E>.
 * Implements all required methods for Lab 4 Exercise 1.
 */
public class MyAList<E> implements Iterable<E> {

    private List<E> list; // underlying ArrayList

    // Constructor
    public MyAList() {
        list = new ArrayList<>();
    }

    // Adds one item to the list
    public void add(E item) {
        list.add(item);
    }

    // Adds all items from another MyAList to this one
    public void addAll(MyAList<E> items) {
        for (E element : items.list) {
            list.add(element);
        }
    }

    // Gets the element at a specific index
    public E get(int index) {
        return list.get(index);
    }

    // Removes the element at a specific index
    public void remove(int index) {
        list.remove(index);
    }

    // Replaces the element at a specific index with a new one
    public void set(int index, E item) {
        list.set(index, item);
    }

    // Returns the size of the list
    public int size() {
        return list.size();
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns an array containing all elements
    public Object[] toArray() {
        return list.toArray();
    }

    // Clears all elements from the list
    public void clear() {
        list.clear();
    }

    // Returns an iterator for the list
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    // Optional: For easy debugging
    @Override
    public String toString() {
        return list.toString();
    }
}

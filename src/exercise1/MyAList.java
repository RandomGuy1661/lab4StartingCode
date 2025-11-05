package exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * MyAList<E> - A custom list class that wraps around Java's ArrayList<E>.
 * Implements all required methods for Lab 4 Exercise 1.
 */
public class MyAList<E> implements Iterable<E> {

    private List<E> list; // underlying ArrayList

    /**
     * constructor for the array list
     */
    public MyAList() {
        list = new ArrayList<>();
    }

    /**
     * adds an item to the front of the list
     * @param item an element you want to add to the list
     */
    public void add(E item) {
        list.add(item);
    }

    /**
     *  Adds all items from another MyAList to this one
     * @param items another MyAList
     */
    public void addAll(MyAList<E> items) {
        for (E element : items.list) {
            list.add(element);
        }
    }

    /**
     * gets the value of an item at the index equal to the input
     * @param index the identifier for the position at which you would like to get the info of
     * @return the value of the item at the index
     */
    public E get(int index) {
        return list.get(index);
    }

    /**
     * removes an item at a specified index
     * @param index the identifier for what element you element you would like to remove an item
     */
    public void remove(int index) {
        list.remove(index);
    }

    /**
     * Replaces the element at a specific index with a new one
     * @param index the identifier for what item you would like to replace
     * @param item the value for the new element you would like to add
     */
    public void set(int index, E item) {
        list.set(index, item);
    }

    /**
     * A method to get the size (number of values) of the array list.
     *
     * @return a number that corresponds the amount of values inside the array list.
     */
    public int size() {
        return list.size();
    }

    /**
     * A method to check if the array list is values within it or not.
     *
     * @return a true or false value. True if the array list is empty, false if not.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * A method to convert the array list into an array.
     *
     * @return the array based on the array list.
     */
    public Object[] toArray() {
        return list.toArray();
    }

    /**
     * A method to clear the entire array list of its content.
     */
    public void clear() {
        list.clear();
    }

    /**
     * This method provides access to an iterator for the array list.
     *
     * @return The iterator traverses and travels across the array list.
     */
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    /**
     * A method to convert the array list into a readable context for the user.
     *
     * @return a toString based on the array list.
     */
    @Override
    public String toString() {
        return list.toString();
    }
}

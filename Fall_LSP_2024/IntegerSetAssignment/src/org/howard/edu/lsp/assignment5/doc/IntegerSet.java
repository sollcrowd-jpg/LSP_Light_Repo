package org.howard.edu.lsp.assignment5.doc;

import java.util.ArrayList;
import java.util.List;

/**
 * The IntegerSet class provides a representation of a mathematical set of integers.
 * It supports standard set operations such as union, intersection, and difference.
 * 
 * @version 1.0
 * @since 2024
 */
public class IntegerSet {

    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default constructor that initializes an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Initializes the set with an already initialized list of integers.
     * 
     * @param set The list of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * 
     * @return the size of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Compares two sets for equality. Two sets are equal if they contain all
     * the same elements, regardless of order.
     * 
     * @param o the object to compare with.
     * @return true if the sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return set.containsAll(that.set) && that.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value.
     * 
     * @param value the value to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * 
     * @return the largest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().max(Integer::compare).get();
    }

    /**
     * Returns the smallest element in the set.
     * 
     * @return the smallest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().min(Integer::compare).get();
    }

    /**
     * Adds a new item to the set if it is not already present.
     * 
     * @param item the item to be added to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it is present.
     * 
     * @param item the item to be removed from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set and 

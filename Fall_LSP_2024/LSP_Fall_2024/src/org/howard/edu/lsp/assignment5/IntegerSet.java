package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    public IntegerSet() {
    }

    // Constructor for an initialized set
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    // Checks if two sets are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return set.containsAll(that.set) && that.set.containsAll(set);
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest value in the set
    public int largest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().max(Integer::compare).get();
    }

    // Returns the smallest value in the set
    public int smallest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().min(Integer::compare).get();
    }

    // Adds an item to the set or does nothing if it's already there
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // Set union
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!this.set.contains(item)) {
                this.set.add(item);
            }
        }
    }

    // Other methods like intersection, diff, and complement should be implemented similarly

    // Check if set is empty
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return the string representation of the set
    @Override
    public String toString() {
        return set.toString();
    }
}
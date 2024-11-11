package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestIntegerSet {

    @Test
    @DisplayName("Test clear and isEmpty methods")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.clear();
        assertTrue(set.isEmpty(), "Set should be empty after calling clear");
    }

    @Test
    @DisplayName("Test length method")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.length(), "Set length should be 2 after adding two elements");
    }

    @Test
    @DisplayName("Test equals method")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(1);

        assertTrue(set1.equals(set2), "Sets should be equal even if elements are in different order");
    }

    @Test
    @DisplayName("Test contains method")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1), "Set should contain added element");
        assertFalse(set.contains(2), "Set should not contain element that was not added");
    }

    @Test
    @DisplayName("Test largest method with exception handling")
    public void testLargest() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(5);
        set.add(3);
        try {
            assertEquals(5, set.largest(), "Largest element should be 5");
        } catch (IntegerSetException e) {
            fail("Exception thrown unexpectedly");
        }
    }

    @Test
    @DisplayName("Test smallest method with exception handling")
    public void testSmallest() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(5);
        set.add(3);
        try {
            assertEquals(1, set.smallest(), "Smallest element should be 1");
        } catch (IntegerSetException e) {
            fail("Exception thrown unexpectedly");
        }
    }

    @Test
    @DisplayName("Test largest method when set is empty")
    public void testLargestEmpty() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::largest, "Should throw IntegerSetException when set is empty");
    }

    @Test
    @DisplayName("Test smallest method when set is empty")
    public void testSmallestEmpty() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::smallest, "Should throw IntegerSetException when set is empty");
    }

    @Test
    @DisplayName("Test add method")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(1); // Adding duplicate, should not increase length
        assertEquals(1, set.length(), "Set length should be 1 after adding duplicate element");
    }

    @Test
    @DisplayName("Test remove method")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1), "Set should not contain element after removal");
    }

    @Test
    @DisplayName("Test union method")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);

        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2), "Union of sets should contain all elements from both sets");
    }

    @Test
    @DisplayName("Test intersect method")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);

        set1.intersect(set2);
        assertTrue(set1.contains(2) && set1.length() == 1, "Intersection should retain only common elements");
    }

    @Test
    @DisplayName("Test diff method")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);

        set1.diff(set2);
        assertTrue(set1.contains(1) && !set1.contains(2), "Difference should only retain elements in the first set that aren't in the second set");
    }

    @Test
    @DisplayName("Test isEmpty method")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "New set should be empty");
        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding elements");
    }

    @Test
    @DisplayName("Test toString method")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString(), "String representation should match the expected format");
    }

	private void assertEquals(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
}

package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void testNullCase() throws Exception{
        try {
            sorting.sort(null);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        } catch (Exception e) {
            throw new Exception("Unexpected exception: " + e);
        }
    }

    @Test
    public void testEmptyCase(){
        int[] input = {};
        sorting.sort(input);
        assertArrayEquals(new int[]{}, input);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] input = {10};
        sorting.sort(input);
        assertArrayEquals(new int[]{10}, input);
    }

    @Test
    public void testSortedArraysCase() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        sorting.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testOtherCases() {
        int[] input = {10, 1, 0, 8, 4, 20, 21, 19};
        int[] expected = {0, 1, 4, 8, 10, 19, 20, 21};
        sorting.sort(input);
        assertArrayEquals(expected, input);

        int[] inputWithDublicate = {0, 5, 2, 1, 5, 8};
        int[] expectedWithDublicate = {0, 1, 2, 5, 5, 8};
        sorting.sort(inputWithDublicate);
        assertArrayEquals(expectedWithDublicate, inputWithDublicate);

        int[] inputWithNegative = {-1, -8, -3, 0, 1, -5};
        int[] expectedWithNegative = {-8, -5, -3, -1, 0, 1};
        sorting.sort(inputWithNegative);
        assertArrayEquals(expectedWithNegative, inputWithNegative);
    }

}
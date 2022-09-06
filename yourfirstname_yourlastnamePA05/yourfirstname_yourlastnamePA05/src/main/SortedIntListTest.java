/**
 * Archibald Kimber 
 * archibaldkimber@brandeis.edu
 * 4/10/2022
 * PA 5
 * The code creates a list object that carries integers. I have written and Junit tests to see if the methods work 
 * There are no known bugs 
 */
package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedIntListTest {
    /**
     * Checks if the code will increase the size of the array 
     */
	@Test
	void testAddArray() {
		SortedIntList myList = new SortedIntList();
		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		myList.add(3);
		System.out.print(myList.toString());
	}
	/**
	 * checks if the array will delete the duplicate number
	 */
	@Test
	void testAddArrayUniqueParameter() {
		SortedIntList myList = new SortedIntList(true);
		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		myList.add(3);
		System.out.print(myList.toString());
	}
	/**
	 * gets if the array is unique and then sets it ot unique
	 */
	@Test
	void testAddArraySetUnique() {
		SortedIntList myList = new SortedIntList();
		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		myList.add(3);
		myList.add(6);
		System.out.println(myList.toString());
		System.out.println(myList.getUnique());
		myList.setUnique(true);
		System.out.println(myList.toString());
		System.out.println(myList.getUnique());
	}
	@Test
	/**
	 * CHecks if you incrase the capacity from the constructor if that works
	 */
	void testAddArrayCapacity() {
		SortedIntList myList = new SortedIntList(20);
		for(int i = 0; i<20; i++)
		{
			myList.add(i);
		}
		myList.add(3);
		myList.add(6);
		System.out.println(myList.toString());
		System.out.println(myList.getUnique());
		myList.setUnique(true);
		System.out.println(myList.toString());
		System.out.println(myList.getUnique());
	}
	/**
	 * Checks the min and max of the array
	 */
	@Test
	void testAddArrayMinMax() {
		SortedIntList myList = new SortedIntList(11);
		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		myList.add(3);
		myList.add(6);
		System.out.println(myList.max());
		System.out.println(myList.min());
	}

	
}

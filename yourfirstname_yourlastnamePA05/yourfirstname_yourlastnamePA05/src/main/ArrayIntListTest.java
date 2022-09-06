package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIntListTest {
/*
 * Resizes the array
 */
	@Test
	void testResizedArray() {
			ArrayIntList myList = new ArrayIntList();
			for(int i = 0; i<11; i++)
			{
				myList.add(i);
			}
			System.out.print(myList.toString());
					}
	/**
	 * Adds one item to the array
	 */
	@Test
	void testAddOneItem() {
			ArrayIntList myList = new ArrayIntList();
			for(int i = 0; i<1; i++)
			{
				myList.add(i);
			}
			System.out.print(myList.toString());
					}
	/**
	 * checks if the code works when the array is empty
	 */
	@Test
	void testNoItem() {
			ArrayIntList myList = new ArrayIntList();
			System.out.print(myList.toString());
	}
	/**
	 * checks the add with a specific index
	 */
	@Test
	void testInsertItem() {
		ArrayIntList myList = new ArrayIntList();
		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		myList.add(4, 56);
		myList.add(0, 78);
		myList.add(13, 23);
		System.out.print(myList.toString());
				}
	@Test
	/**
	 * removes an item
	 */
	void testRemoveItem() {
		ArrayIntList myList = new ArrayIntList();
		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		myList.remove(6);
		myList.remove(13);
		myList.remove(2);
		System.out.print(myList.toString());
				}
	@Test
	/**
	 * clears the list and checks if ir isEmpty
	 */
	void testisEmptyandCLear() {
		ArrayIntList myList = new ArrayIntList();

		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		myList.remove(6);
		myList.remove(13);
		myList.remove(2);
		System.out.println(myList.isEmpty());
		myList.clear();
		System.out.println(myList.isEmpty());
				}
	@Test
	/**
	 * checks the size of rhe array
	 */
	void testSize() {
		ArrayIntList myList = new ArrayIntList();

		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		System.out.print(myList.size());
				}
	@Test
	/**
	 * try the getters 
	 */
	void testIndex() {
		ArrayIntList myList = new ArrayIntList();

		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		System.out.println(myList.indexOf(4));
		System.out.println(myList.indexOf(23));
		System.out.println(myList.get(5));
		System.out.println(myList.get(69));
			}
	
}

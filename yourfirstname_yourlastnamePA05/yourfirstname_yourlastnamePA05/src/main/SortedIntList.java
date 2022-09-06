/**
 * Archibald Kimber 
 * archibaldkimber@brandeis.edu
 * 4/10/2022
 * PA 5
 * The code creates a list object that carries integers. I have written and Junit tests to see if the methods work 
 * There are no known bugs 
 */
package main;

import java.util.*;

public class SortedIntList extends ArrayIntList {
private int defaultCapacity = 10;
private boolean isSorted;
private boolean isUnique;
/**
 * constructor that allows the array to be sorted and not contain duplicates
 */

public SortedIntList()
{
	super();
	isSorted = true;
	isUnique = false;
}
/**
 *  constructor that allows the array to be sorted and not contain duplicates
 * @param unique
 */
public SortedIntList(boolean unique)
{
	super();
	isSorted = true;
	isUnique = unique;
}
/**
 *  constructor that allows the array to be sorted and not contain duplicates
 * @param capacity
 */
public SortedIntList(int capacity)
{
	super(capacity);
	isSorted = true;
	isUnique = false;
}
/**
  * constructor that allows the array to be sorted and not contain duplicates
 * @param unique
 * @param capacity
 */
public SortedIntList(boolean unique, int capacity)
{
	super(capacity);
	isSorted = true;
	isUnique = unique;
}
/**
 * Returns a boolean to see if the boolean is sorted
 * @return
 */
public boolean checkSort()
{
	for(int i=0; i<endOfList-1;i++)
	{
		if(list[i]>list[i+1])
		{
			return false;
		}
	}
	return true;
}
/**
 * checks if the array is supposed to have duplicates
 * @return
 */
public boolean getUnique()
{
	return isUnique;
}
/**
 * changes if the array can have duplicates
 * @param value
 */
public void setUnique(boolean value)
{
	isUnique = value;
	if(isUnique == true)
	{
		for(int i = 0; i<endOfList; i++)
		{
			if(list[i]==list[i+1])
			{
				remove(i+1);
			}
		}
	}
	
}
/**
 * method checks if an array is sorted
 */
public void sort()
{
	int temp;
	if(checkSort()==false)
	{
		for(int i=0; i<endOfList-1;i++)
		{
			if(list[i]>list[i+1])
			{
				temp = list[i+1];
				list[i+1] = list[i];
				list[i] = temp;
			}
		}
	}
}
/**
 * adds a value to an array
 */
public void add(int value)
{
	int i=0;
	if(isUnique == true && this.contains(value))
 {
	 return;
 }
	if(isSorted == true)
	{
		for( i=0; i<endOfList; i++)
		{
			if(list[i] > value)
			{
				break;
			}
		}
		super.add(i, value);
	}
	else 
	{
		super.add(value);
	}
		
}
/**
 * doesn't work and throws an exception
 */
public void add(int index, int value)
	{
	throw new UnsupportedOperationException();
	}
/**
 * 
 * @return the first index value and throws an exception the array is empty
 */
public int min()
	{
		if(isEmpty() == true)
		{
			throw new NoSuchElementException();
		}
		else {
			return list[0];
		}
	}
/**
 * 
 * @return the last and largest index value and throws exception if the array is empty 
 */
public int max()
{
	if(isEmpty() == true)
	{
		throw new NoSuchElementException();
	}
	else {
		return list[endOfList-1];
	}
}
/**
 * returns a string of the array
 */
public String toString()
{
	String printList = "s:[";
	for(int i = 0; i<endOfList-1; i++)
	{
		printList += list[i] + " ,";
	}
		printList += list[endOfList-1]+ "]";
	if(isUnique == true)
	{
		printList += "U"; 
	}
	return printList;
}
/**
 * returns the index of a value 
 */
public int indexOf(int value) {
	return Arrays.binarySearch(list, value);
}
}

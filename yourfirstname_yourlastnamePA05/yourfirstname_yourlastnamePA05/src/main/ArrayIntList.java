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

public class ArrayIntList {
protected int[] list;
protected int endOfList;

/*
 * constructor
 */
public ArrayIntList() {
		this(10);
}
/**
 * constructor 
 * @param capacity
 */
public ArrayIntList(int capacity) {
		this.list = new int[capacity];
		endOfList=0;
}
/**
 * method thats adds a value to the end of the array object
 * @param value
 */
public void add(int value)
{
	this.add(endOfList,value);
}
/**
 * Adds a value at a given index
 * @param index
 * @param value
 */
public void add(int index, int value)
{
		ensureCapacity(endOfList+2);
		checkIndex(index, 0, list.length);
		
		for(int i = endOfList; i>=index; i--)
		{
				list[i+1] = list[i];
		}
			list[index] = value;
		endOfList++;
	}
/**
 * 
 * @param index
 * @return index position of a list
 */
public int get(int index)
	{
	checkIndex(index, 0, list.length);
	return list[index];
	}
/**
 * 
 * @param value
 * @return the index of a value
 */
public int indexOf(int value)
{
	for(int i = 0; i<list.length; i++)
	{
		if(list[i]==value)
		{
			return i;
		}
	}
	return -1;
}
/**
 * removes an index postion and the value in the index
 * @param index
 */
public void remove(int index)
{
	checkIndex(index, 0, list.length);
	for(int i = index; i < list.length-1; i++)
	{
		list[i] = list[i+1];
	}
	list[endOfList] = 0;
	endOfList--;
}
/**
 * 
 * @return the size of the enternal array
 */
public int size()
{
	return endOfList;
}
/**
 * @return a string that contains the variables in an array
 */
public String toString()
{
	String printList = "[";
	if(endOfList == 0)
	{
		printList += "]";
		return printList;
	}
	else {
	for(int i =0; i<endOfList-1; i++)
	{
		printList = printList + list[i]+ ", ";
	}
	printList += list[endOfList-1] +"]";
	return printList;
	
}
}
/**
 * clears the contents of the array
 */
public void clear()
{
	int[]list1 = new int[list.length];
	list = list1;
	endOfList =0;
}
/**
 * 
 * @param value
 * @return a boolean to see if a value is in the array
 */
public boolean contains(int value)
{
	return this.indexOf(value)>=0;
}
/**
 * increases the capacity of the array
 * @param capacity
 */
public void ensureCapacity(int capacity)
{
// reseize the array
	if(capacity> list.length)
	{
		int newLength = list.length+ capacity;
		int[]list1 = new int[newLength];
		for(int i =0; i<list.length; i++)
		{
			list1[i]=list[i];
		}
		list = list1;
	}
}
/**
 * 
 * @return a boolean thats checks if an array is empty
 */
public boolean isEmpty()
{
return endOfList == 0;
}
/**
 * checks if the index of a certain method is within the bounds of the array
 * @param index 
 * @param min
 * @param max
 */
private void checkIndex(int index, int min, int max)
{
	if(index > max)
	{
		throw new ArrayIndexOutOfBoundsException("index is too large");
	}
	if(index < min)
	{
		throw new ArrayIndexOutOfBoundsException("index is too small");
	}
}
}



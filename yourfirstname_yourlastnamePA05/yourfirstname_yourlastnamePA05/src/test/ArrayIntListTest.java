package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.ArrayIntList;


class ArrayIntListTest {
	@Test
	void test1() {
		ArrayIntList myList = new ArrayIntList();
		for(int i = 0; i<11; i++)
		{
			myList.add(i);
		}
		System.out.print(toString());
	}

	@Test
	void test2() {
		//implement me
	}

}

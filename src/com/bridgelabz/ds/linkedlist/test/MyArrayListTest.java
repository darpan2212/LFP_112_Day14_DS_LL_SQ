package com.bridgelabz.ds.linkedlist.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.ds.linkedlist.MyArrayList;
import com.bridgelabz.ds.linkedlist.MyList;
import com.bridgelabz.ds.linkedlist.SortedLinkedList;

public class MyArrayListTest {

	@Test
	public void searchWithValue() {

		System.out.println(
				"----------------searchWithValue-----------------");
		MyList<Integer> list = new MyArrayList<>();

		list.append(56);
		list.append(30);
		list.append(40);
		list.append(70);

		System.out.println(list);

		assertTrue(list.search(30));
		assertFalse(list.search(60));
	}

	@Test
	public void addAfterKey() {
		System.out.println(
				"-----------------------addAfterKey---------------------");
		MyList<Integer> list = new MyArrayList<>();

		list.append(56);
		list.append(30);
		list.append(70);

		System.out.println(list);

		int pos = list.index(30) + 1;
		list.insert(pos, 40);

		System.out.println(list);
	}

	@Test
	public void removeKeyAndSize() {
		System.out.println(
				"-----------------------removeKeyAndSize---------------------");
		MyList<Integer> list = new MyArrayList<>();

		list.append(56);
		list.append(30);
		list.append(40);
		list.append(70);

		System.out.println(
				"Before removing element size is : "
						+ list.size());
		System.out.println(list);
		if (list.search(40)) {
			list.remove(40);
		}
		System.out
				.println("After removing element size is : "
						+ list.size());
		System.out.println(list);
	}

	@Test
	public void sortedList() {
		System.out.println(
				"-----------------------sortedList---------------------");
		MyList<Integer> list = new SortedLinkedList<>();

		list.append(56);
		list.append(30);
		list.append(40);
		list.append(70);

		System.out.println(list);
	}

}
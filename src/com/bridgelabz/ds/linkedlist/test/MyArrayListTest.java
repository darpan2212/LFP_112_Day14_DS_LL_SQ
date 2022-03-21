package com.bridgelabz.ds.linkedlist.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.ds.linkedlist.MyArrayList;
import com.bridgelabz.ds.linkedlist.MyList;

public class MyArrayListTest {

	@Test
	public void searchWithValue() {

		MyList<Integer> list = new MyArrayList<>();

		list.append(56);
		list.append(30);
		list.append(40);
		list.append(70);

		System.out.println(list);
		
		assertTrue(list.search(30));
		assertFalse(list.search(60));
	}

}
package com.singleton;

import java.util.Comparator;

public class SortTest {
	/**
	 * 
	 * @param list
	 *            待排序的数组
	 * @param com
	 *            比较两个对象的比较器
	 */
	public <T> void sort(T[] list, Comparator<T> com) {
		boolean flag = true;
		for (int i = 0, len = list.length; i < len && flag; ++i) {
			flag = false;
			for (int j = 0; j < len - 1; ++j) {
				if (com.compare(list[j], list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					flag = true;
				}
			}
		}
	}

	public <T extends Comparable<T>> void sort(T[] list) {
		boolean flag = true;
		for (int i = 0, len = list.length; i < len && flag; ++i) {
			flag = false;
			for (int j = 0; j < len - 1; ++j) {
				if (list[j].compareTo(list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					flag = true;
				}
			}
		}
	}
}

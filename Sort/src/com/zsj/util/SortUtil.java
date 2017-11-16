package com.zsj.util;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

/**
 * 排序工具类
 * @author ZhouShuJu
 * @date   2017年11月15日---下午10:30:51
 */
public class SortUtil {
	/**
	 * 用来生成n个元素范围在rangeL到rangeR之间的随机数组,rangeL必须要小于等于rangeR
	 * @param n
	 * @param rangeL
	 * @param rangeR
	 * @return 
	 */
	public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
		int [] arr = null;
		if (rangeL <= rangeR) {
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr [i] = (int)(Math.random() * (rangeR - rangeL + 1)) + rangeL;
			}
		} else {
			throw new RuntimeException("rangeL must be less than or equal to rangeR");
		}
		return arr;
	}
	
	/**
	 * 用来交换arr数组中索引为index1和index2的位置的值
	 * @param arr
	 * @param index1
	 * @param index2
	 */
	public static void swap(int [] arr, int index1, int index2) {
		arr [index1] ^= arr [index2];
		arr [index2] ^= arr [index1];
		arr [index1] ^= arr [index2];
	}
	
	/**
	 * 给一个数组arr判断是不是完全从小到大排序的
	 * @param arr
	 * @return
	 */
	public static boolean isSorted(int [] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if ( arr [i] > arr [i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] generateAlmostSortedArr(int n, int m) {
		int [] arr = new arr[n];
			
		return arr;
	}

}
package com.zsj.test;

import java.util.Arrays;

import com.zsj.sort.BubbleSort;
import com.zsj.sort.InsertionSort;
import com.zsj.sort.InsertionSort2;
import com.zsj.sort.MergeSort;
import com.zsj.sort.SelectionSort;
import com.zsj.sort.SortDao;
import com.zsj.util.SortUtil;

/**
 * 用来测试排序类的类
 * @Author ZhouShuJu
 * @date   2017年11月16日下午3:12:15
 */
public class SortTest {

	public static void main(String[] args) {
		
		//生成数组
		int n = 100000;
		int [] arr = SortUtil.generateRandomArray(n, 0, n);
		int [] arrCopy = Arrays.copyOf(arr, n);
		int [] arrCopy2 = Arrays.copyOf(arr, n);
		int [] arrCopy3 = Arrays.copyOf(arr, n);
		int [] arrCopy4 = Arrays.copyOf(arr, n);
		
		
		int [] almostSortedArr = SortUtil.generateAlmostSortedArr(n, 10);
		int [] almostSortedArrCopy = Arrays.copyOf(almostSortedArr, n);
		int [] almostSortedArrCopy2 = Arrays.copyOf(almostSortedArr, n);
		int [] almostSortedArrCopy3 = Arrays.copyOf(almostSortedArr, n);
		int [] almostSortedArrCopy4 = Arrays.copyOf(almostSortedArr, n);
		
		
	    //创建排序类
		SortDao selectionSort = new SelectionSort();
		SortDao insertionSort = new InsertionSort();
		SortDao insertionSort2 = new InsertionSort2();
		SortDao mergeSort = new MergeSort();
		SortDao bubbleSort = new BubbleSort();

		System.out.println("* 对 " + n + " 个元素的普通数组进行排序：");
		SortUtil.sortTest("BubbleSort", bubbleSort, arrCopy4);
		SortUtil.sortTest("SelectionSort", selectionSort, arr);
//		SortUtil.sortTest("InsertionSort", insertionSort, arrCopy);
//		SortUtil.sortTest("InsertionSort2", insertionSort2, arrCopy2);
//		SortUtil.sortTest("MergeSort", mergeSort, arrCopy3);
		
		System.out.println("\n* 对" + n + " 个元素的近乎有序的数组排序：");
		SortUtil.sortTest("bubbleSort", bubbleSort, almostSortedArrCopy4);
		SortUtil.sortTest("SelectionSort", selectionSort, almostSortedArr);
//		SortUtil.sortTest("InsertionSort", insertionSort, almostSortedArrCopy);
//		SortUtil.sortTest("InsertionSort2", insertionSort2, almostSortedArrCopy2);
//		SortUtil.sortTest("MergeSort", mergeSort, almostSortedArrCopy3);

		
	}
	
}

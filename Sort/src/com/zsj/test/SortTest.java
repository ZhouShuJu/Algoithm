package com.zsj.test;

import java.util.Arrays;

import com.zsj.sort.InsertionSort;
import com.zsj.sort.InsertionSort2;
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
		int n = 10000;
		int [] arr = SortUtil.generateRandomArray(n, 0, n);
		int [] arrCopy = Arrays.copyOf(arr, n);
		int [] arrCopy2 = Arrays.copyOf(arr, n);
		int [] almostSortedArr = SortUtil.generateAlmostSortedArr(n, 10);
		int [] almostSortedArrCopy = Arrays.copyOf(almostSortedArr, n);
		int [] almostSortedArrCopy2 = Arrays.copyOf(almostSortedArr, n);

	    //创建排序类
		SortDao selectionSort = new SelectionSort();
		SortDao insertionSort = new InsertionSort();
		SortDao insertionSort2 = new InsertionSort2();


		SortUtil.sortTest("SelectionSort", selectionSort, arr);
		SortUtil.sortTest("SelectionSort-a", selectionSort, almostSortedArr);
		SortUtil.sortTest("InsertionSort", insertionSort, arrCopy);
		SortUtil.sortTest("InsertionSort-a", insertionSort, almostSortedArrCopy);
		SortUtil.sortTest("InsertionSort2", insertionSort2, arrCopy2);
		SortUtil.sortTest("InsertionSort2-a", insertionSort2, almostSortedArrCopy2);


		/*
		//排序
		selectionSort.sort(arr);
		
		//打印
		if (SortUtil.isSorted(arr)) {
			SortUtil.printArr(arr);
		}*/
		
	}
	
}

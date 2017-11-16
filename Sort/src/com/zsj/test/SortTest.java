package com.zsj.test;

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
		int n = 1000;
		int [] arr = SortUtil.generateRandomArray(n, 0, n);
		
	    //创建排序类
		SortDao selectionSort = new SelectionSort();
		
		//排序
		selectionSort.sort(arr);
		
		//打印
		if (SortUtil.isSorted(arr)) {
			SortUtil.printArr(arr);
		}
		
	}
	
}

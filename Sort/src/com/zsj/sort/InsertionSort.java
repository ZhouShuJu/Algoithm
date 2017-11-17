package com.zsj.sort;

import com.zsj.util.SortUtil;

/**
 * 插入排序法
 * @author ZhouShuJu
 * @date   2017年11月16日下午9:52:43
 */
public class InsertionSort implements SortDao {

	@Override
	public void sort(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
				SortUtil.swap(arr, j, j-1);
			}
		}
	}

}

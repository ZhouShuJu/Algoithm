package com.zsj.sort;

import com.zsj.util.SortUtil;

/**
 * 选择排序法实现类
 * @author ZhouShuJu
 * @date   2017年11月16日 14:30:20
 */
public class SelectionSort implements SortDao {

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					SortUtil.swap(arr, i, j);
				}
			}
		}
	}

}

package com.zsj.sort;

import com.zsj.util.SortUtil;

/**
 * 最简单的冒泡排序
 * @Author ZhouShuJu
 * @date   2017年11月19日下午10:14:41
 */
public class BubbleSort implements SortDao {

	@Override
	public void sort(int[] arr) {
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					SortUtil.swap(arr, j, j + 1);
				}
			}
		}
	}

}

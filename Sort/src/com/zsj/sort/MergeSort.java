package com.zsj.sort;

/**
 * 归并排序法
 * @Author ZhouShuJu
 * @date   2017年11月19日下午9:14:29
 */
public class MergeSort implements SortDao {

	@Override
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length-1); 
	}

	private void mergeSort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		int mid = (l + r) / 2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);
		merge(arr, l, r);
	}

	private void merge(int[] arr, int l, int r) {
		int [] temp = new int[r - l + 1];
		for (int i = l; i <= r; i++) {
			temp[i - l] = arr[i]; 
		}
		int mid = (l + r) / 2;
		int i = l, j = mid + 1;
		for (int k = l; k <= r; k++) {
			if (i > mid) {
				arr[k] = temp[j - l];
				j ++;
			} else if (j > r) {
				arr[k] = temp[i - l];
				i ++;
			} else if (temp[i - l] < temp[j - l]) {
				arr[k] = temp[i - l];
				i ++;
			} else {
				arr[k] = temp[j - l];
				j ++;
			}
		}
	}

}

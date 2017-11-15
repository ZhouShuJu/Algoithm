package com.zsj.util;

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
	
	
	
}
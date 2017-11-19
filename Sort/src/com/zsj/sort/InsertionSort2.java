package com.zsj.sort;

import com.zsj.sort.SortDao;

/**
 * 
 * @author ZhouShuJu
 * @date   2017年11月19日 14:01:36
 */
public class InsertionSort2 implements SortDao{

    public void sort(int [] arr) {    
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
        }
    }

}
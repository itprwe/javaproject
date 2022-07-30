package it.prwe.algorithm;

import it.prwe.commonclass.Test;

/**
 * @Author zhengxr
 * @Date 2022/7/26 11:15
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.冒泡 比较相邻的元素。如果第一个比第二个大，就交换他们两个
         * 2.选择排序原理即是，遍历元素找到一个最小（或最大）的元素，把它放在第一个位置，然后再在剩余元素中找到最小（或最大）的元素，把它放在第二个位置，依次下去，完成排序
         */
//        int[] arr = new int[]{1,3,4,2,8,5,6};
//        int[] bubble = bubble(arr);
        test08();
    }

    // 1,3,4,2,8,5,6
    public static int[] bubble(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void test08(){
        int[] test = {0,0,1,1,1,1,2,3,3,3};
        for (int i=0;i<test.length;i++){
            for (int j=i+1;j<test.length;j++){
                if (test[i]==test[j]){
                    test[j]=100;
                }
            }

        }

        for (int k=0;k<test.length;k++){
            if (test[k]!=100){
                System.out.println(test[k]);
            }
        }
    }
}

package com.myself.basis;

public class basisLearning {
    public static void main(String[] args) {

        int[] arry = {2, 5, 6, 9, 12, 18, 22, 33, 45, 54};
        System.out.println(search(arry, 23));
    }

    /**
     * 二分查找 while实现方式
     * @param arry
     * @param key
     * @return
     */
    private static int search(int[] arry, int key) {
        int low = 0;
        int high = arry.length - 1;
        if (key < arry[0] || key > arry[high] || low > high) {
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key > arry[mid]) {
                low = mid + 1;
            }
            if (key < arry[mid]) {
                high = mid - 1;
            }
            if (key == arry[mid]) {
                return mid;
            }
        }
        return -1;
    }


}

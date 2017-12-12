package sort;

import org.junit.Test;

/**
 * @author cool
 * Date 2017-12-04 11:06
 */
public class BubbleSort {
    /**
     * 冒泡排序
     * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对
     * 相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。即：每当两相邻的
     * 数比较后发现它们的排序与排序要求相反时，就将它们互换。
     */
    @Test
    public void test_bubbleSort() {
        //int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        int a[] = {99, 88, 65, 17, 6};
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        show("", a);
    }
    /**
     * 插入排序
     */
    @Test
    public void test_insertSort() {
        //int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        int a[] = {99, 88, 65, 17, 26};
        for (int i = 0; i < a.length - 1; i++) {
            int target = a[i + 1];
            int j = i + 1;
            while (j > 0 && target < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = target;
        }

        show("-------------", a);
    }
    @Test
    public void test_insertSort2() {
        //int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        int a[] = {99, 88, 65, 17, 26};
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];  //将大于temp 的值整体后移一个单位
            }
            a[j + 1] = temp;
        }

        System.out.println("");
        System.out.println("------------------------------------");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }
    }

    /**
     * 希尔排序
     */
    @Test
    public void test_shellSort() {

        int a[] = {1, 54, 6, 3, 78, 34, 12, 45, 56, 100};
        show("排序前：", a);
        double d1 = a.length;
        int temp = 0;
        while (true) {
            d1 = Math.ceil(d1 / 2);
            int d = (int) d1;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i += d) {
                    int j = i - d;
                    temp = a[i];
                    for (; j >= 0 && temp < a[j]; j -= d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            if (d == 1) {
                break;
            }
        }

        show("排序后：", a);
    }

    @Test
    public void test_shellSort2() {
        //int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        int[] a = {7, 6, 5, 4, 3, 2, 1};
        show("排序之前：", a);
        System.out.println("--------------------------------");
        //希尔排序
        int d = a.length;
        while(true)
        {
            d=d/2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i = i + d) {
                    int temp = a[i];
                    int j;
                    for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                    show(true, a);
                }
                show("------------------------------------", a);
            }
            if (d == 1) {
                break;
            }
        }
        show("排序之后：", a);
    }

    /**
     * 选择排序
     */
    @Test
    public void selectSort() {
        int a[]={99,54,6,3,78,34,12,45};
        show("before:", a);
        int minIndex=0;
        int temp=0;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;//无序区的最小数据数组下标
            for (int j = i + 1; j < a.length; j++) {
                //在无序区中找到最小数据并保存其数组下标
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        show("after:", a);
    }

    /**
     * 堆排序
     * @param text
     * @param a
     */

    /**
     * 快速排序
     */
    public void sort(int arr[],int low,int high) {
        int l=low;
        int h=high;
        int povit=arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
        }
        show("", arr);
        System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
        if (l > low) {
            sort(arr, low, l - 1);
        }
        if (h < high) {
            sort(arr, l + 1, high);
        }
    }

    /**
     * 归并排序
     * @param text
     * @param a
     */

    /**
     * 基数排序
     * @param text
     * @param a
     */

    /**
     * 归并排序
     * @param text
     * @param a
     */

    /**
     * 二分法查找
     *
     * @param text
     * @param a
     */


    /**
     *
     */
    @Test
    public void test() {
        int y = 8>>1;
        System.out.println(y);
    }

    final int x = 9;
























    private void show(String text, int[] a) {
        System.out.println(text);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    private void show(boolean enter, int[] a) {
        if (enter) {
            System.out.println("");
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}

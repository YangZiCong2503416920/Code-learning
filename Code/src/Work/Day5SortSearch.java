package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Day5SortSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        //录入6个整数
        for (int i = 0;i < arr.length;i++) {
            System.out.print("请输入第"+ (i + 1) + "个整数:");
            arr[i] = sc.nextInt();
        }

        //排序并打印
        Arrays.sort(arr);
        System.out.println("升序结果：" + Arrays.toString(arr));

        //二分查找
        System.out.print("请输入要查找的值：");
        int target = sc.nextInt();
        int idx = Arrays.binarySearch(arr, target);

        //输出下标
        System.out.println(idx >= 0?idx:-1);
        sc.close();
    }

}

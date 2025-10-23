package Work;

import java.util.Scanner;

public class Day1TempConvert {
    public static void main(String[] args) {
        System.out.print("请输入温度（摄氏度）：");
        Scanner sc = new Scanner(System.in);
        double userTemp = sc.nextInt();
        double F;
        F = userTemp * 9/5 + 32;
        System.out.println("您输入的温度转化为华氏度为：" + F + "F");
    }
}

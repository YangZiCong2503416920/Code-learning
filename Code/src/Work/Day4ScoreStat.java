package Work;

import java.util.Scanner;

public class Day4ScoreStat {
    static void main(String[] args) {
        double[] scores = new double[5];
        Scanner sc = new Scanner(System.in);

        //循环录入5名学生的成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入" + (i + 1) + "的成绩:");
            scores[i] = sc.nextDouble();
        }

        //调用方法并打印
        System.out.printf("平均分：%.1f%n",avg(scores));
        System.out.printf("最高分：%.1f%n",max(scores));
        System.out.printf("最低分：%.1f%n",min(scores));
        sc.close();
    }
    public static double avg(double[] arr) {
        double sum = 0;
        for (double v : arr)
            sum += v;
        return sum/arr.length;
    }
    public static double max(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
    public static double min(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }
}


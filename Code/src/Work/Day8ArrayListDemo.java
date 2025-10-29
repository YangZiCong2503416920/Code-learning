package Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day8ArrayListDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        while (true) {
            System.out.print("请输入你的名字(end 结束)：");
            String name = sc.nextLine();
            if ("end".equalsIgnoreCase(name)) break;
            System.out.print("请输入你的年龄：");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("请输入你的成绩：");
            double score = Double.parseDouble(sc.nextLine());

            list.add(new Student(name, age, score));
        }

        //打印全部
        list.forEach(System.out::println);

        //输出平均成绩
        System.out.printf("平均成绩是%.2f%n",avg(list));
        sc.close();
    }

    //求平均
    public static double avg(List<Student> list) {
        if (list.isEmpty()) return 0;
        double sum = 0;
        for (Student s : list) sum += s.getScore();
        return sum / list.size();
    }
}

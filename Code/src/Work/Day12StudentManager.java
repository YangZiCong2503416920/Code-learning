package Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day12StudentManager {
    private static final List<Student> list = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        while (true) {
            System.out.println("=== 学生管理系统 ===");
            System.out.println("1 添加  2 删除  3 修改成绩  4 查询  5 统计  0 退出");
            System.out.print("请选择：");
            switch (sc.nextLine()) {
                case "1" -> addStu();
                case "2" -> delStu();
                case "3" -> updateScore();
                case "4" -> queryStu();
                case "5" -> statStu();
                case "0" -> { System.out.println("再见！"); return; }
                default -> System.out.println("无效选择，请重试！");
            }
        }
    }

    //对应5个方法
    private static void addStu() {
        System.out.print("姓名："); String name = sc.nextLine();
        System.out.print("年龄："); int age = Integer.parseInt(sc.nextLine());
        System.out.print("成绩："); double score = Double.parseDouble(sc.nextLine());
        list.add(new Student(name, age, score));
        System.out.println("已添加！");
    }

    private static void delStu() {
        System.out.print("要删除的姓名：");
        String name = sc.nextLine();
        boolean removed = list.removeIf(s -> name.equals(s.getName()));
        System.out.println(removed ? "已删除！" : "未找到！");
    }

    private static void updateScore() {
        System.out.print("要修改的姓名：");
        String name = sc.nextLine();
        for (Student s : list) {
            if (name.equals(s.getName())) {
                System.out.print("新成绩：");
                double newScore = Double.parseDouble(sc.nextLine());
                s.setScore(newScore);   // 需要在 Student 里补 setScore
                System.out.println("已修改！");
                return;
            }
        }
        System.out.println("未找到！");
    }

    private static void queryStu() {
        System.out.print("要查询的姓名：");
        String name = sc.nextLine();
        list.stream()
                .filter(s -> name.equals(s.getName()))
                .findFirst()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("未找到！"));
    }

    private static void statStu() {
        if (list.isEmpty()) {
            System.out.println("暂无数据！");
            return;
        }
        double avg = list.stream().mapToDouble(Student::getScore).average().orElse(0);
        double max = list.stream().mapToDouble(Student::getScore).max().orElse(0);
        double min = list.stream().mapToDouble(Student::getScore).min().orElse(0);
        System.out.printf("总人数：%d  平均分：%.1f  最高分：%.1f  最低分：%.1f%n",
                list.size(), avg, max, min);
    }
}


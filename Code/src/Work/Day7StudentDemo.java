package Work;

public class Day7StudentDemo {
    static void main(String[] args) {
        //创建3个对象
        Student[] stu = {
                new Student("Alice",18,85.5),
                new Student("Bob",19,92),
                new Student("Coco",20,78),
        };

        //遍历打印
        for (Student s :stu) {
            System.out.println(s);
        }

        //计算平均成绩
        System.out.printf("平均成绩：%.2f%n",avg(stu));
    }

    //静态工具方法
    public static double avg(Student[] arr) {
        double sum = 0;
        for (Student s : arr) sum += s.getScore();
        return sum / arr.length;
    }
}

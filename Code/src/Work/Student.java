package Work;

public class Student {
    //字段
    private String name;
    private int age;
    private double score;

    //全参构造
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //toString 方便打印
    @Override
    public String toString() {
        return name + "(age=" + age + ", score=" + score + ")";
    }

    //仅暴露一个读成绩的方法
    public double getScore() {
        return score;
    }
}

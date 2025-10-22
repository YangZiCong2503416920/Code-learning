package Work;

import java.util.Scanner;

public class Day2GuessOne {
    static void main(String[] args) {
        int secret = new java.util.Random().nextInt(100) + 1;   // 1~100
        System.out.print("请输入你猜测的数字：");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        sc.close();
        if (secret < guess) {
            System.out.println("大了");
        }   else if (secret > guess) {
            System.out.println("小了");
        }   else if (secret == guess) {
            System.out.println("答对了");
        }
        System.out.print("题目答案是：");
        System.out.println(secret);
    }
}

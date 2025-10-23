package Work;

import java.util.Scanner;

public class Day3GuessLoop {
    static void main(String[] args) {
        int time = 0;
        int secret = new java.util.Scanner(System.in).nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜测的数字：");
        int guess = sc.nextInt();
        while (true) {
            secret = sc.nextInt();
            ++time;
            if (secret > guess) {
                System.out.println("小了");
            } else if (secret < guess) {
                System.out.println("大了");
            } else if (secret == guess) {
                System.out.println("答对了！");
                sc.close();
                break;
            }
        }
        System.out.println("你一共猜了" +  time + "轮");
    }
}

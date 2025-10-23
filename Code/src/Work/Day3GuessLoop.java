package Work;

import java.util.Scanner;

public class Day3GuessLoop {
    static void main(String[] args) {
        int secret = new java.util.Random().nextInt(100) + 1;   // 1~100
        Scanner sc = new Scanner(System.in);
        int count = 0;//计数器
        while (true) {//无限循环
            System.out.print("请输入你猜测的数字：");
            int guess = sc.nextInt();
            count++;//每猜一次记录+1
            if (guess < secret) {
                System.out.println("小了");
            }   else if (guess > secret) {
                System.out.println("大了");
            }   else {
                System.out.println("回答正确！你一共猜了" + count + "轮");
                break;
            }
        }
        sc.close();
    }
}

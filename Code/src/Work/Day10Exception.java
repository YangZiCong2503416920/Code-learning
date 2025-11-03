package Work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10Exception {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            try {
                System.out.print("请输入0-100的整数：");
                int score =  sc.nextInt();  //可能抛出InputMismatchException

                if(score<0||score>100){
                    throw new ScoreOutOfRangeException("成绩必须在0-100之间");
                }

                System.out.println("你的成绩是：" + score);
                break;                      //正确就跳出
            } catch (InputMismatchException e) {
                System.out.println("请输入整数！");
                sc.next();                  //清楚错误标记
            } catch (ScoreOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}

//自定义异常
class ScoreOutOfRangeException extends Exception {
    public ScoreOutOfRangeException(String msg) {
        super(msg);
    }
}

package Work;

import java.util.Scanner;

public class Day6StringFun {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();//读一整行
        System.out.println("单词数：" + wordCount(line));
        System.out.println("倒序：" + reverseWords(line));
        sc.close();
    }

    //TODO-1 统计单词
    public static int wordCount(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        return  s.trim().split("\\s+").length;// \\s+ 匹配一个或者多个空白
    }

    //TODO-2 单词倒序
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0)sb.append(" ");
        }
        return sb.toString();
    }
}

package Work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day9Dictionary {
    static void main(String[] args) {
        //初始化5组对照
        Map<String, String> map = new HashMap<>();
        map.put("apple","苹果");
        map.put("banana","香蕉");
        map.put("cat","猫");
        map.put("dog","狗");
        map.put("phone","手机");

        Scanner sc = new Scanner(System.in);

        //循环查找
        while (true){
            System.out.print("请输入英文单词（键入end结束）：");
            String word = sc.nextLine();
            if ("end".equalsIgnoreCase(word)){
                break;
            }

            //默认值
            System.out.println(map.getOrDefault(word,"未收录"));
        }
        sc.close();
    }
}

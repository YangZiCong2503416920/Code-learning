package Work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day11FileCopy {
    static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("请输入源文件路径：");
        String src = console.readLine();
        System.out.print("请输入目标文件路径：");
        String dst = console.readLine();

        //逐行复制并计数
        int lines = 0;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(src));
        BufferedWriter bw = Files.newBufferedWriter(Paths.get(dst))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                lines++;
            }
        }
        System.out.println("复制完成，共" + lines + "行");
    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demo Mysql_Utils
 * 读取文本文件
 * @author Will
 * @date 2020/8/17
 */
public class ReadTxtFile {
    public static void readLine(String path) throws IOException {
        FileReader fr = null;
        String line = "";

        try {
            //读取文件
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("无法读取文件");
            return;
        }

        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {

            //TODO 筛选条件

        }

        br.close();
        fr.close();

    }
}

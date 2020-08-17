import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Demo Mysql_Utils
 *
 * @author Will
 * @date 2020/8/17
 */
public class WriteFile {
    public static void write(String path,String string) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path,true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //一次写一行

        bw.write(string);
        bw.newLine();  //换行用
        bw.flush();
        //关闭流
        bw.close();
        System.out.println("写入成功");
    }
}

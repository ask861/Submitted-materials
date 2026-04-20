package week3_xu_mingcheng.practice2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // ① ファイル作成
        try {
            File file = new File("nikujaga.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ② 書き込み
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("nikujaga.txt"))) {
            bw.write("carrot");
            bw.newLine();
            bw.write("potato");
            bw.newLine();
            bw.write("meat");
            bw.newLine();
            bw.write("onion");
            bw.newLine();

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ③ 読み込み
        try (BufferedReader br = new BufferedReader(new FileReader("nikujaga.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
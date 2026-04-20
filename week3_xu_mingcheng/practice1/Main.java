package week3_xu_mingcheng.practice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // List作成
        List<Student> student = new ArrayList<>();

        // データ追加
        student.add(new Student("Alice", 15, 60));
        student.add(new Student("Takuya", 12, 90));
        student.add(new Student("Ryo", 25, 34));
        student.add(new Student("Suzanu", 18, 20));

        // 条件：60未満 ＋ 昇順
        List<Student> result = student.stream()
                .filter(s -> s.getScore() < 60)
                .sorted(Comparator.comparingInt(Student::getScore))
                .collect(Collectors.toList());

        // 出力
        System.out.println(result);
    }
}
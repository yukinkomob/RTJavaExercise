import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 2回目課題のメインクラス
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // コンソールに「HelloWorld」を表示してみよう。
        main.sayHello();
        // コンソールに1～10まで足した結果を表示してみよう。
        main.sumFrom1to10();
        // コンソールに「3年後の今日が何曜日なのか」を計算して表示してみよう。
        main.askDayAfter3Years();
        // コンソールに「引数が0なら偽。引数が1なら真」と表示してみよう。
        main.checkIntArg(0);
        main.checkIntArg(1);
        // コレクション型は割愛。String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
        main.printListData();
        main.printMapData();
    }

    /**
     * コンソールに「HelloWorld」を表示する
     */
    private void sayHello() {
        String greeting = "HelloWorld";
        System.out.println(greeting);
    }

    /**
     * コンソールに1～10まで足した結果を表示する
     */
    private void sumFrom1to10() {
        for (int i = 0, sum = 0; i <= 10; i++, sum += i) if (i == 10) System.out.println(sum);
    }

    /**
     * コンソールに「3年後の今日が何曜日なのか」を計算して表示する
     */
    private void askDayAfter3Years() {
        LocalDateTime timeAfter3Years = LocalDateTime.now().plusYears(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E", Locale.JAPANESE);
        String format = timeAfter3Years.format(formatter);
        System.out.println("3年後の今日は、" + format + "曜日です。");
    }

    /**
     * コンソールに「引数が0なら偽。引数が1なら真」と表示する
     * @param arg 判定用の引数
     */
    private void checkIntArg(int arg) {
        if (arg == 1) {
            System.out.println("真");
        } else if (arg == 0) {
            System.out.println("偽");
        }
    }

    /**
     * コレクション型は割愛。String型のListを作成して、その内容をコンソール画面に表示する
     */
    private void printListData() {
        List<String> list = new ArrayList<>();
        list.add("これは");
        list.add("Listの");
        list.add("データです");
        for (String item : list) {
            System.out.print(item);
        }
        System.out.println();
    }

    /**
     * コレクション型は割愛。String型のMapを作成して、その内容をコンソール画面に表示する
     */
    private void printMapData() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "これは");
        map.put("two", "Mapの");
        map.put("three", "データです");

        System.out.print(map.get("one"));
        System.out.print(map.get("two"));
        System.out.print(map.get("three") + "\n");
    }
}

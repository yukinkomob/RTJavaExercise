import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private void sayHello() {
        String greeting = "HelloWorld";
        System.out.println(greeting);
    }

    private void sumFrom1to10() {
        for (int i = 0, sum = 0; i <= 10; i++, sum += i)
            if (i == 10) System.out.println(sum);
    }

    private void askDayAfter3Years() {
        LocalDateTime time = LocalDateTime.now();
        time.withYear(time.getYear() + 3);
        DayOfWeek day = DayOfWeek.from(time);
        String dayStr = "";
        switch (day) {
            case MONDAY:
                dayStr = "月曜日";
                break;
            case TUESDAY:
                dayStr = "火曜日";
                break;
            case WEDNESDAY:
                dayStr = "水曜日";
                break;
            case THURSDAY:
                dayStr = "木曜日";
                break;
            case FRIDAY:
                dayStr = "金曜日";
                break;
            case SATURDAY:
                dayStr = "土曜日";
                break;
            case SUNDAY:
                dayStr = "日曜日";
                break;
        }
        System.out.println("3年後の今日は、" + dayStr + "です。");
    }

    private void checkIntArg(int arg) {
        if (arg == 1) {
            System.out.println("真");
        } else if (arg == 0) {
            System.out.println("偽");
        }
    }

    private void printListData() {
        List<String> list = new ArrayList<String>();
        list.add("これは");
        list.add("Listの");
        list.add("データです");
        for (String item : list) {
            System.out.print(item);
        }
        System.out.println("");
    }

    private void printMapData() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("one", "これは");
        map.put("two", "Mapの");
        map.put("three", "データです");

        System.out.print(map.get("one"));
        System.out.print(map.get("two"));
        System.out.print(map.get("three") + "\n");
    }
}

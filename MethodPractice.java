package kadai3;

import java.util.Calendar;

public class MethodPractice {
    public static void main(String[] args) {
        //うるう年判定
        int year = 2001;
        boolean isLeap = isLeapYear(year);
        if(isLeap == true){
            System.out.println(year + "年はうるう年です");
        }else{
            System.out.println(year + "はうるう年ではありません");
        }
        //合計値
        int num1 = 100;
        int sum1 = getSum(num1);
        System.out.println(num1 + "の合計値は？：" + sum1);
        //素数判定
        int num2 = 2;
        boolean prime = isPrime(num2);
        if(prime == true){
            System.out.println(num2 + "　は素数です");
        }else{
            System.out.println(num2 + "　は素数ではありません");
        }

        //階乗
        int num3 = 5;
        var fact = favtorial(num3);
        System.out.println(num3 + "の階乗は？：" + fact);
        //配列の最大値
        int[] array = {10, 84, 61, 91, 42};
        int intmax = findMax(array);
        System.out.println("配列の最大値は？：" + intmax);
        //回文
        String s = "level";
        var palind = ispalindrome(s);
        if(palind){
            System.out.println(s + " は回文です。");
        }else{
            System.out.println(s + " は回文ではありません");
        }
        //年齢取得
        int years = 2001;
        int month = 4;
        int day = 25;
          //Calendarメソッドで返されたageをそれぞれprintlnに入れる
        int age = getAge(years, month, day);
        System.out.println("生年月日は" + years + "年" + month + "月" + day + "日で、現在の年齢は" + age + "歳です。");
        //配列のソート
        int[] scores = {29, 42, 52, 12, 5, 45, 67, 1};
        sortArray(scores);
        //二分探索
        int[] index = {13, 11, 42, 36, 71, 29, 38, 23};
        sortArray(index);
        getIndex(index, 36, 0, index.length);

    }

    public static boolean isLeapYear(int yaer) {
        //うるう年を判定するif文を作成。
        if (yaer % 4 == 0) {
            if (yaer % 100 == 0) {
                if (yaer % 400 == 0) {
                    //型がbooleanの為、trueかfalseで返す。
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getSum(int num) {
        //合計値を計算する処理
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        //素数判定
        var prinme = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int favtorial(int num) {
        //階乗
        int fackt = 1;
        for (int i = 1; i <= num; i++) {
            fackt *= i;
        }
        return fackt;
    }

    public static int findMax(int array[]) {
        //配列の最大値
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (num < array[i]) {
                num = array[i];
            }
        }
        return num;
    }

    public static boolean ispalindrome(String str) {
        //回文
        int s = str.length();
        for (int i = 0; i < s / 2; i++) {
            if (str.charAt(i) != str.charAt(s - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int getAge(int year, int month, int day) {
        //CalendarクラスでgetInstanceメソッドを呼び、オブジェクトを作成している、
        Calendar time = Calendar.getInstance();
        //変数「nowyear」に「time.get(Calendar.YEAR)」で取得した”年”を代入する。
        int nowyear = time.get(Calendar.YEAR);
        //変数「nowmonth」に「time.get(Calendar.MONTH)」で取得した”月”を代入する。
        int nowmonth = time.get(Calendar.MONTH);
        //変数「nowday」に「time.get(Calendar.DAY_OF_MONTH)」で取得した”日”を代入する。
        int nowday = time.get(Calendar.DAY_OF_MONTH);
        //ageに取得した”年”から引数で渡された”年”を引いた値を代入する。
        int age = nowyear - year;
        //nowmanthに代入した値がmainメソッドで入力したmonth値より小さい比較
        if (nowmonth < month) {
            //小さい場合、ageを-1する
            age--;
            //上のif文がfalseの場合
            //nowmonthとmonthが等しい　かつ　nowdayが入力したdayより小さいかを比較
        } else if (nowmonth == month && nowday < day) {
            //falseの場合ageから-1する
            age--;
        }
        //結果として出た値(age)を返す
        return age;
    }

    public static void sortArray(int[] array) {
        int[] scores = array;

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = scores.length - 1; j > 0 + i; j--) {
                if (scores[j - 1] > scores[j]) {
                    int tmp = scores[j - 1];
                    scores[j - 1] = scores[j];
                    scores[j] = tmp;
                }
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }

    public static void getIndex(int[] index, int middle, int start, int end) {
        int[] scores = index;
        var mdl = (start + end) / 2;

        if (scores[mdl] == middle) {
            middle = scores[mdl];
            System.out.println(middle + "は" + (mdl + 1) + "番目です");
        } else if (scores[mdl] < middle) {
            start = mdl + 1;
        }else{
            end = mdl - 1;
        }
    }
}



















package homeWorks.hw_3;

public class Task3 {
    public static void main(String[] args) {
        // task 1
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        // Так как тип d1 double то и деление на него будет типом double и 11 / 5.5 = 2.0
        // d2 % i1 -> общий тип будет double  1.3 и
        // 2.0 + 1.3 - 20 ->  -16.7

        System.out.println(result);

        // task 2

        int a =5;
        int b = a-- - --a + ++a + a++ + a;
        // 5 - 3 + 4 + 4 + 5 ->  15
        System.out.println(b);

        b = 8;
        a = ++b - b++ + ++b - --b;
        // 9 - 9 + 11 - 10 ->  1
        System.out.println(a);
    }
}

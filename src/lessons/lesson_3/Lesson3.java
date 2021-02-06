package lessons.lesson_3;
// TODO Lesson-3:  Арифметические и логические операции. Операции сравнения и присваивания
public class Lesson3 {
    public static void main(String[] args) {

        int a = 5;
        int b = a * 2;

        int x=1, y=2, z=3;

        int c = x + y;
        System.out.println(x+y); // -, * , /
        System.out.println(c);


        int d = 10 / 3; // d =3 потому что тип int // округление не будет

        System.out.println(d);
        System.out.println(12 / 5); // 2 - потому что оба числа int по умол-ю

        double d1 = 10;
        double d2 = 3;
        double d3 = d1 / d2;

        System.out.println(d3); // 3.33333... потому что тип double

        // TODO:  Unary operations ++, -- унарные операторы
        // Сначала все префиксы и постфиксы сработают, а потом арифметические операции.

        int aa = 5;
        int bb = 3;
//        int cc = aa - bb++; // 2 ->  cc = 5 - 3 а потом уже bb увеличивается - Постфикс
//        System.out.println(cc); // 2
//        System.out.println(bb); // 4

        int cc = aa - ++bb; // 1 Префикс cc = 5 - 4; Поотму что сначала увеличивется
        System.out.println(cc); // 1
        System.out.println(bb); // 4

        int n = 5;
        //// Сначала все префиксы и постфиксы сработают, а потом арифметические операции.
        int res = ++n - --n - n-- + n++; // 6-5-5+4. Но результат конечного n++ будет 5, но берется преждное значение, т.е. 4
        System.out.println(res);


        a=b=c=18;

        long i = 100L;
        //int j = i; // ОШИБКА нужно перевести на тип int

        // TODO ^ - сравнение лишь когда один true или false тогда и будет true
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;

        System.out.println(b1 ^ b2 ^ b3 ^ b4); // false

        b1 = true;
        b2 = true;
        b3 = true;
        b4 = false;
        System.out.println(b1 ^ b2 ^ b3 ^ b4); // true

        b1 = true;
        b2 = true;
        b3 = false;
        b4 = false;
        System.out.println(b1 ^ b2 ^ b3 ^ b4); // false

        b1 = true;
        b2 = false;
        b3 = false;
        b4 = false;
        System.out.println(b1 ^ b2 ^ b3 ^ b4); // true


        a = 10;
        b = 3;
        c = ++a - b*2; // 11 - 3*2 = 11-6 = 5
        System.out.println(c);

        char c1 = 'a';
        int m = 10;
        System.out.println(c1 + m); // 107 -> 'a' в юникоде равен к 97



    }
}

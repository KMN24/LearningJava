package lessons.lesson_4;
// TODO Понятия «класс» и «объект». Знакомство со ссылочными типами данных

// В классе дожно быть лишь один public class и имя должно соот-ть с именем файла
// public class Hmm{
//     public static void main(String[] args) {
//         System.out.println("2nd");
//     }
//}

public class Lesson4 {
    int id; // переменные вне функции это Instance variables - Экземпляры класса
    String name;
    double balance;

    public static void main(String[] args) {

        Lesson4 bankAccount = new Lesson4();

        // Можем и так создавать string
        String name = "Meder";
        String name2 = new String("Mederbek");


    }
}
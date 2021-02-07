package homeWorks.hw_4;

public class Student {
    String id; // студ билет
    String name; // имя
    String surname;
    int course;
    float mathAverageGrade;
    float economyAverageGrade;
    float foreignLangAverageGrade;

}

class StudentTest{
    public static void main(String[] args) {
        float averageGradeAllLessons;
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.id = "1804.01001";
        st1.name = "Mike";
        st1.surname = "Johnson";
        st1.course = 2;
        st1.mathAverageGrade = 95.4F;
        st1.economyAverageGrade = 80.7F;
        st1.foreignLangAverageGrade = 95F;

        st2.id = "1804.01002";
        st2.name = "Sam";
        st2.surname = "Kris";
        st2.course = 3;
        st2.mathAverageGrade = 79.6F;
        st2.economyAverageGrade = 90F;
        st2.foreignLangAverageGrade = 89.5F;

        st3.id = "1804.01003";
        st3.name = "Kate";
        st3.surname = "Fassenber";
        st3.course = 1;
        st3.mathAverageGrade = 92.8F;
        st3.economyAverageGrade = 70.2F;
        st3.foreignLangAverageGrade = 80F;

        averageGradeAllLessons = (st1.mathAverageGrade +st1.economyAverageGrade + st1.foreignLangAverageGrade)/3;
        System.out.println("First student's average grade = " + averageGradeAllLessons);

        averageGradeAllLessons = (st2.mathAverageGrade +st2.economyAverageGrade + st2.foreignLangAverageGrade)/3;
        System.out.println("Second student's average grade = " + averageGradeAllLessons);

        averageGradeAllLessons = (st3.mathAverageGrade +st3.economyAverageGrade + st3.foreignLangAverageGrade)/3;
        System.out.println("Third student's average grade = " + averageGradeAllLessons);
    }
}

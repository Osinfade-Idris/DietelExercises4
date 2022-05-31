package StudentGrade;

public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Jane Green", 96.5);
        Student account2 = new Student("Mustapha Sadam", 56.9);

        System.out.printf("%s's Letter Grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's Letter Grade is: %s%n", account2.getName(), account2.getLetterGrade());

    }
}

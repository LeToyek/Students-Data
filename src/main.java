import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] student = new Student[numberOfStudents];

        for (int i = 0 ; i < numberOfStudents; i++){
            student[i] = new Student();
            student[i].enroll();
            student[i].payTuition();
            System.out.println(student[i].toString());
        }


    }
}
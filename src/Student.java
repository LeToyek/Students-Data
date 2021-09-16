import java.util.Scanner;

class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    public Student (){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name ");
        this.firstName = in.nextLine();

        System.out.print("Enter your last name ");
        this.lastName = in.nextLine();

        System.out.println("What's your grade ? \n1\n2\n3");
        this.grade = in.nextInt();

        setStudentID();

        System.out.println(firstName +" "+ lastName + " " + grade + " " + studentID);
    }

   private void setStudentID(){
        id++;
        this.studentID = grade + "" +id;
   }
   public void enroll(){
       Scanner in = new Scanner(System.in);

       do{
           System.out.print("Enroll course (Q to quit)");
           String course = in.nextLine();
           if(!course.equals("Q")){
               tuitionBalance = tuitionBalance + courseCost;
           } else {
               break;
           }
       } while (1 != 0);
       System.out.println("ENROLLED IN : ");
       System.out.println("TUITION BALLANCE : " + tuitionBalance);
   }
   public void viewBalance(){
       System.out.println("Your balance is $" + tuitionBalance);
   }
   public void payTuition(){
        System.out.println("Enter your payment here $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        viewBalance();

   }

    @Override
    public String toString() {
        return "\nStudent\n" +
                "firstName\t= " + firstName + "\n" +
                "lastName\t= " + lastName + "\n" +
                "grade\t\t= " + grade + "\n" +
                "studentID\t= " + studentID + "\n" +
                "courses\t\t= " + courses + "\n" +
                "tuitionBalance\t= " + tuitionBalance
                ;
    }
}

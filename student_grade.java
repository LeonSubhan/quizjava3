package quiz_java_03;

public class student_grade {



    public static void main(String[] args) {

        String grade = "A+";
        switch (grade){
            case("A+"):

                System.out.println("Your grade is Very Good: " +grade);
                break;
            case("A"):
                System.out.println("Your grade is good: " +grade);
                break;
            case("B"):
                System.out.println("Your grade is Good: " +grade);
                break;
            case("C"):
                System.out.println("Your grade is Fair: " +grade);
                break;
            case ("d"):
                System.out.println("Your grade is can do better: " +grade);
                break;
            case("E"):
                System.out.println("You grade is just passed" +grade);
            case("F"):
                System.out.println("Your grade is fail: " +grade);
                break;
            default:
                System.out.println("Invalid Grade.");
        }



    }
}

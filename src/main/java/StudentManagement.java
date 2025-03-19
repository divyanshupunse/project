import java.util.Scanner;
import java.lang.String;
class Student{
    String firstName;
    String middleName;
    String lastName;
    int rollNo;
    double marks;

    public Student(String firstName,String middleName,String lastName,int rollNo,double marks){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    void displayInformation(){
        System.out.println("First name ="+ firstName+" Middle name="+middleName+" Last name="+lastName+" RollNo="+rollNo+" Marks="+marks);
    }
}

class StudentManagement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of student");
        int size= sc.nextInt();
        sc.nextLine();

        Student[] obj=new Student[size];

        for (int i=0;i<size;i++){
            System.out.println("Enter detail for student "+ (1+i));

            System.out.println("Enter First Name: ");
             String firstName=sc.nextLine();

            System.out.println("Enter Middle Name: ");
            String middleName=sc.nextLine();

            System.out.println("Enter Last Name: ");
            String lastName=sc.nextLine();

            System.out.println("Enter RollNo: ");
            int rollNo=sc.nextInt();

            System.out.println("Enter Marks: ");
            double marks=sc.nextInt();
            sc.nextLine();

            obj[i]=new Student(firstName,middleName,lastName,rollNo,marks);
        }
        for (int i=0;i<size;i++){
            obj[i].displayInformation();
        }
    }
}
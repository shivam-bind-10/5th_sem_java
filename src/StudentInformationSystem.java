abstract class Student {

    String name;
    int rollNo;
    String course;


    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }


    abstract void displayDetails();
}



class StudentInfo extends Student {


    StudentInfo(String name, int rollNo, String course) {
        super(name, rollNo, course);
    }


    @Override
    void displayDetails() {
        System.out.println("----- Student Information -----");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Course       : " + course);
    }
}



public class StudentInformationSystem {

    public static void main(String[] args) {


        StudentInfo student = new StudentInfo(
                "Shivam",
                101,
                "B.Tech Computer Science"
        );


        student.displayDetails();
    }
}
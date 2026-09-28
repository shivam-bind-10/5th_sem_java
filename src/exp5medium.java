import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class exp5medium {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85.5);

        // Serialization
        try {
            FileOutputStream file = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(s1);
            out.close();
            file.close();

            System.out.println("Student object serialized.");

        } catch (Exception e) {
            System.out.println(e);
        }

        // Deserialization
        try {
            FileInputStream file = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            Student s2 = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("\nStudent object deserialized:");
            s2.display();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
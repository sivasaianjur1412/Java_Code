package constructor;

public class Student extends College{

    String studentName;
    public Student(String studentName) {
        super("University of Missouri- Kansas City");
        this.studentName = studentName;
    }

    public Student() {
        super("UMKC");
        studentName = "Siva Sai Anjuri";
    }

    public Student(String studentName, String collegeName) {
        super(collegeName);
        this.studentName = studentName;
    }

}

package constructor;

public class Main {
    /***
     * Constructor overloading
     * @param args
     */
    public static void main(String[] args) {
        //Constructor with no arguments passed.
        Student student = new Student();
        System.out.println(student.studentName);
        System.out.println(student.collegeName);

        //Constructor with one argument
        student = new Student("Siva");
        System.out.println(student.collegeName);
        System.out.println(student.studentName);

        student = new Student("Siva", "UMKC");
        System.out.println(student.collegeName);
        System.out.println(student.studentName);
    }
}

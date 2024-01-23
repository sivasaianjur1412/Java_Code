package statickeyword;

public class Student {
    static int rollNumber = 25;

    public static int getRollNumber() {
        return rollNumber;
    }
    public static void main(String[] args) {
        System.out.println("Roll number is: " + getRollNumber());
        System.out.println("Printing roll number using class name: " + Student.getRollNumber());
    }
}

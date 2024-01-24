package collections;

import pojo.Student;

import java.util.ArrayList;

public class StudentData {
    /***
     *
     * @param students
     * @return
     */
    public ArrayList<Student> removeStudentsByGPA(ArrayList<Student> students) {
        double totalGPA = 0.0;
        for(Student student : students)
            totalGPA += student.getGpa();
        double averageGPA = totalGPA / students.size();
        ArrayList<Student> removeList = new ArrayList<>();
        for(Student student : students) {
            if(student.getGpa() < averageGPA)
                removeList.add(student);
        }
        students.removeAll(removeList);
        return students;
    }

}

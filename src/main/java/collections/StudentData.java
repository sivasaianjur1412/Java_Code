package collections;

import pojo.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentData {
    /***
     * Removing the students by GPA
     * @param students
     * @return
     */
    public ArrayList<Student> removeStudentsByGPA (ArrayList<Student> students) {
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

    /***
     * To retrieve the student data by name.
     * @param studentName
     * @return
     */
    public Student getStudentData(String studentName) {
        Map<String, Student> map = new HashMap<>();
        map.put("Shiva", new Student("Shiva", "A", 3.5));
        map.put("Sai", new Student("Sai", "B", 3.7));
        map.put("Anjuri", new Student("Anjuri", "C", 3.2));
        return  map.get(studentName);
    }

}

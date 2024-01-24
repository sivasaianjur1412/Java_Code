package collections;

import pojo.Student;

import java.util.ArrayList;

public class Conversion {
    /***
     * Converting the students list into string array.
     * @param students
     * @return
     */
    public String[] convertStudentNames(ArrayList<Student> students) {
        ArrayList<String> listNames = new ArrayList<>();
        for(Student student : students)
            listNames.add(student.getFirstName());
        String[] names = new String[listNames.size()];
        for(int i = 0; i < listNames.size(); i++) {
            names[i] = listNames.get(i);
        }
        return names;
    }
}

package collections;

import org.junit.Assert;
import org.junit.Test;
import pojo.Student;

import java.util.ArrayList;

public class StudentDataTest {
    StudentData studentData = new StudentData();

    /***
     * Success case
     * The average from the list is 3.46
     * If the student is less than 3.46 is removed.
     */
    @Test
    public void testRemoveStudentSuccess() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Shiva", "Sai", 3.5));
        students.add(new Student("Teja", "A", 3.1));
        students.add(new Student("Venkat", "B", 3.8));
        students = studentData.removeStudentsByGPA(students);
        Assert.assertEquals(2, students.size());
    }

    /***
     * Failure case
     * To check whether the input is empty list.
     */
    @Test
    public void testRemoveStudentFailure() {
        ArrayList<Student> students = new ArrayList<>();
        studentData.removeStudentsByGPA(students);
        Assert.assertTrue(students.isEmpty());
    }

    /***
     * Edge case
     * No student should be removed when the GPA are similar to all students.
     */
    @Test
    public void testRemoveStudentEdge() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Shiva", "Sai", 3.5));
        students.add(new Student("Teja", "A", 3.5));
        students.add(new Student("Venkat", "B", 3.5));
        studentData.removeStudentsByGPA(students);
        Assert.assertEquals(3, students.size());
    }

    /***
     * Success case
     *
     */
    @Test
    public void testStudentDataByNameSuccess() {
        Student student = studentData.getStudentData("Sai");
        Assert.assertNotNull(student);
        Assert.assertEquals(3.7, student.getGpa(), 0.01);
    }

    /***
     * Failure Case
     * Check by giving wrong input.
     */
    @Test
    public void testStudentDataByNameFailure() {
        Student student = studentData.getStudentData("Siva");
        Assert.assertNull(student);
    }

    /***
     * Edge case
     * Checking by giving the input as null;
     */
    @Test
    public void testStudentDataByNameEdgeCase() {
        Student student = studentData.getStudentData(null);
        Assert.assertNull(student);
    }

}

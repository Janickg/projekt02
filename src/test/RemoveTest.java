package test;

import model.Student;
import model.Team;

public class RemoveTest {
    public static void main(String[] args) {

        Team team1 = new Team("24S", "A1.28");
        Student student1 = new Student("Ib", true, new int[]{02, 4, 7, 10, 12});
        team1.addStudents(student1);
        Student student2 = new Student("Søren", true, new int[]{4, 7, 10, 12, 02});
        team1.addStudents(student2);
        System.out.println("Antal studerende = " + team1.getStudentList().size());
        team1.removeStudent("Søren");
        System.out.println("Antal studerende = " + team1.getStudentList().size());
        team1.removeStudentBenn("Søren");
        System.out.println("Antal studerende = " + team1.getStudentList().size());
    }
}

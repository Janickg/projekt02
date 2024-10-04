package test;

import com.sun.source.tree.IdentifierTree;
import model.Student;
import model.Team;

public class App {
    public static void main(String[] args) {
        Team team1 = new Team("24S", "A1.28");
        Team team2 = new Team("24T", "A1.32");

        Student student1 = new Student("Janick", true, new int[]{02, 4, 7, 10, 12});
        Student student2 = new Student("Alex Sander", true, new int[]{4, 7, 10, 12, 02});
        Student student3 = new Student("Henrik", true, new int[]{7, 10, 12, 02, 4});
        Student student4 = new Student("Søren", true, new int[]{10, 12, 02, 4, 7});
        Student student5 = new Student("Jakob", true, new int[]{12, 02, 4, 7, 10});
        Student student6 = new Student("Bent", true, new int[]{7, 7, 7, 7, 7});

        team1.addStudents(student1);
        team1.addStudents(student2);
        team1.addStudents(student3);
        team2.addStudents(student4);
        team2.addStudents(student5);
        team2.addStudents(student6);

        System.out.println("Team 1:");
        for (Student student : team1.getStudentList()) {
            System.out.println(student.getName() + " - Karakterer: " + student.printGrades());
        }
        System.out.println();
        System.out.println("Team 2:");
        for (Student student : team2.getStudentList()) {
            System.out.println(student.getName() + " - Karakterer: " + student.printGrades());
        }

        System.out.println(student1.averageGradeStudent());
        System.out.println(team1.averageGradeTeam());
        System.out.println(team2.highScoreStudents(4));

        char[] correctAnswers = {'A', 'B', 'B', 'D', 'C', 'A', 'C', 'D','B', 'D'};
        for (Student student : team1.getStudentList()) {
            student.generateTestAnswers();
            System.out.println(student.correctAnswers(correctAnswers));
        }
        for (Student student : team2.getStudentList()) {
            student.generateTestAnswers();
            System.out.println(student.correctAnswers(correctAnswers));
        }
    }
}
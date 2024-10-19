package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public void addStudents (Student student) {
        studentList.add(student);
    }

    public ArrayList<Student> activeStudents() {
        ArrayList<Student> activeStudents = new ArrayList<>();
        for (Student student : studentList ) {
            if (student != null && student.isActive()) {
                activeStudents.add(student);
            }
        }
        return activeStudents;
    }

    public void removeStudent (String name) {
        studentList.remove(name);
    }

    public void removeStudentBenn(String name) {
        Student studentToRemove = null;
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                studentToRemove = student;
            }
        }
        if (studentToRemove != null) {
            studentList.remove(studentToRemove);
        }
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public double averageGradeTeam() {
        int totalGrades = 0;
        for (Student student : studentList) {
            totalGrades += student.averageGradeStudent();
        }
        return totalGrades / studentList.size();
    }

    public ArrayList<Student> highScoreStudents(double minAverage) {
        ArrayList<Student> highScoreStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.isActive() && student.averageGradeStudent() > minAverage) {
                highScoreStudents.add(student);
            }
        }
        return highScoreStudents;
    }
}

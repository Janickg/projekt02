package model;

import java.util.Random;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;
    private char[] testAnswers;

    public Student(String name, boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
        this.testAnswers = new char[10];
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public String printGrades() {
        String gradeString = "";
        for (int grade : grades) {
            gradeString += grade + " ";
        }
        return gradeString;
    }

    public int highestGrade() {
        int highestGrade = grades[0];
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public double averageGradeStudent() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    public char[] generateTestAnswers() {
        Random randomAnswers = new Random();
        char[] options = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < testAnswers.length; i++) {
            testAnswers[i] = options[randomAnswers.nextInt(options.length)];
        }
        return testAnswers;
    }

    public String toString() {
        return name;
    }

    public int correctAnswers(char[] correct) {
        int count = 0;
        for (int i = 0; i < testAnswers.length; i++) {
            if (testAnswers[i] == correct[i]) {
                count++;
            }
        }
        return count;
    }
}

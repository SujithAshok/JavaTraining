import java.util.*;

// Class representing a Student
class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

// Class representing an Assignment
class Assignment {
    private String name;
    private int totalPoints;

    public Assignment(String name, int totalPoints) {
        this.name = name;
        this.totalPoints = totalPoints;
    }

    public String getName() {
        return name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }
}

// Class representing a Grade
class Grade {
    private Student student;
    private Assignment assignment;
    private int score;

    public Grade(Student student, Assignment assignment, int score) {
        this.student = student;
        this.assignment = assignment;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public int getScore() {
        return score;
    }
}

// Class representing the Gradebook Manager
class GradebookManager {
    private List<Student> students;
    private List<Assignment> assignments;
    private List<Grade> grades;

    public GradebookManager() {
        students = new ArrayList<>();
        assignments = new ArrayList<>();
        grades = new ArrayList<>();
    }

    // Add student to the gradebook
    public void addStudent(Student student) {
        students.add(student);
    }

    // Add assignment to the gradebook
    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    // Record a grade for a student's assignment
    public void recordGrade(Student student, Assignment assignment, int score) {
        grades.add(new Grade(student, assignment, score));
    }

    // Calculate the average grade for a student
    public double calculateAverageGrade(Student student) {
        int totalScore = 0;
        int count = 0;
        for (Grade grade : grades) {
            if (grade.getStudent().equals(student)) {
                totalScore += grade.getScore();
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalScore / count;
    }

    // Generate a report of all grades
    public void generateReport() {
        System.out.println("Grade Report:");
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + " (" + student.getId() + ")");
            for (Assignment assignment : assignments) {
                double studentAverage = calculateAverageGrade(student);
                System.out.println("- Assignment: " + assignment.getName() + ", Score: " + studentAverage);
            }
            System.out.println("-------------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of students, assignments, and gradebook manager
        Student student1 = new Student("John", "S001");
        Student student2 = new Student("Alice", "S002");

        Assignment assignment1 = new Assignment("Assignment 1", 100);
        Assignment assignment2 = new Assignment("Assignment 2", 50);

        GradebookManager gradebookManager = new GradebookManager();

        // Adding students and assignments to the gradebook manager
        gradebookManager.addStudent(student1);
        gradebookManager.addStudent(student2);

        gradebookManager.addAssignment(assignment1);
        gradebookManager.addAssignment(assignment2);

        // Recording grades
        gradebookManager.recordGrade(student1, assignment1, 85);
        gradebookManager.recordGrade(student1, assignment2, 45);
        gradebookManager.recordGrade(student2, assignment1, 90);
        gradebookManager.recordGrade(student2, assignment2, 50);

        // Generating a report
        gradebookManager.generateReport();
    }
}

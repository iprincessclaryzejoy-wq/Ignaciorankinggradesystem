/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rankinggradesystem;

/**
 *
 * @author User
 */
public class TestClass {

    public static void main(String[] args) {

        Student[] students = {
            new Student("S001", "Juan Dela Cruz", "BSIT", 91.50),
            new Student("S002", "Maria Santos", "BSCS", 95.25),
            new Student("S003", "Pedro Reyes", "BSIT", 88.75),
            new Student("S004", "Ana Garcia", "BSCS", 97.00),
            new Student("S005", "Carlos Mendoza", "BSIS", 89.50),
            new Student("S006", "Sofia Torres", "BSIT", 93.75),
            new Student("S007", "Daniel Cruz", "BSIS", 86.25),
            new Student("S008", "Angela Flores", "BSCS", 94.50)
        };

        System.out.println("==============================================");
        System.out.println("       STUDENT RANKING SYSTEM");
        System.out.println("==============================================");

        System.out.println("\nStudents Before Sorting:");
        displayStudents(students);

        SortingAlgorithm.selectionSort(students);

        System.out.println("\nStudents After Sorting:");
        displayStudents(students);

        System.out.println("\n==============================================");
        System.out.println("                 TOP 3 STUDENTS");
        System.out.println("==============================================");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public static void displayStudents(Student[] students) {

        System.out.printf("%-10s %-20s %-15s %s%n",
                "ID", "Name", "Program", "Final Grade");

        System.out.println("--------------------------------------------------------------");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
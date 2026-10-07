/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rankinggradesystem;

/**
 *
 * @author User
 */

public class SortingAlgorithm {

    public static void selectionSort(Student[] students) {

        for (int i = 0; i < students.length - 1; i++) {

            int highestIndex = i;

            for (int j = i + 1; j < students.length; j++) {

                if (students[j].getFinalGrade() >
                    students[highestIndex].getFinalGrade()) {

                    highestIndex = j;
                }
            }

            
            Student temp = students[i];
            students[i] = students[highestIndex];
            students[highestIndex] = temp;
        }
    }
}
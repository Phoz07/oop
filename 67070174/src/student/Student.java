/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author LAB203_70
 */
public class Student {

    public String name;
    public double mScore;
    public double fScore;

    public void showGrade() {
        double s = (mScore * 0.4) + (fScore * 0.4) + 20;
        String g;
        if (s >= 80) {
            g = "A";
        } else if (80 > s && s >= 70) {
            g = "B";
        } else if (70 > s && s >= 60) {
            g = "C";
        } else if (60 > s && s >= 50) {
            g = "D";
        } else {
            g = "F";
        }
        System.out.println("Your grade is " + g + ".");
    }
}

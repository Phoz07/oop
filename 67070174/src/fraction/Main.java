/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author LAB203_70
 */
public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        f.topN = 2;
        f.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f.toFraction());
        System.out.println("before " + f.toFloat());
        f.addFraction(f2);
        System.out.println("after " + f.toFraction());
        System.out.println("after " + f.toFloat());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author LAB203_70
 */
public class Fraction {

    public int topN;
    public int btmN;

    public String toFraction() {
        return "To fraction : " + topN + "/" + btmN;
    }

    public String toFloat() {
        double res = (double) topN / btmN;
        return "To float : " + res;
    }

    public void addFraction(Fraction f) {
        if (this.btmN == f.btmN) {
            this.topN += f.topN;
        } else {
            this.topN = this.topN * f.btmN + f.topN * this.btmN;
            this.btmN = this.btmN * f.btmN;
        }
    }
}


/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 202
*/

import java.io.*;

public class Fraction {

    private int numerator, denominator;

    public Fraction() {
        numerator = denominator = 0;
    }

    public void print() {
        System.out.print(numerator + "/" + denominator);
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        denominator = d;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public static void main(String args[]) {
        try {
            Fraction frac = new Fraction();

            int numerator = 1;
            int denominator = 3;

            if (args.length >= 1) {
                numerator = Integer.parseInt(args[0]);
            }

            if (args.length >= 2) {
                denominator = Integer.parseInt(args[1]);
            }

            frac.setNumerator(numerator);
            frac.setDenominator(denominator);

            System.out.print("The fraction is: ");
            frac.print();
            System.out.println("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

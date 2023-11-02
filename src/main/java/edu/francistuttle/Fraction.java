package edu.francistuttle;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction () {
        numerator = 0;
        denominator = 1;
    }

    public Fraction (int num, int den) {
        numerator = num;
        denominator = den;
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction(numerator, denominator);
        if (denominator != other.denominator) {
            int lcm = lcm(result.denominator, other.denominator);
            result.denominator = lcm;
            result.numerator = (numerator * (lcm/denominator)) + (other.numerator * (lcm/other.denominator));
        } else {
            result.numerator += other.numerator;
        }
        result.reduce();
        return result;
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(numerator * other.numerator, denominator * other.denominator);
        result.reduce();
        return result;
    }

    private void reduce () {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public String toString () {
        return numerator + "/" + denominator;
    }
}

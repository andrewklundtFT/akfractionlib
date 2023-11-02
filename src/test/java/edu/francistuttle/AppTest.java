package edu.francistuttle;

import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void trueIfAddingWorks () {
        Fraction a = new Fraction(1, 3);
        Fraction b = new Fraction(3,5);

        assertEquals(a.add(b).toString(),"14/15");
    }

    @Test
    public void trueIfMultiplyingWorks () {
        Fraction a = new Fraction(1, 3);
        Fraction b = new Fraction(3,5);

        assertEquals(a.multiply(b).toString(),"1/5");
    }
}

package com.project.geometry;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeometryCalculatorTest {

    private GeometryCalculator calc = new GeometryCalculator();

    @Test
    public void getPerimeterCuba() {
        int res = calc.getPerimeterCuba(8);
        assertEquals(96, res);
    }

    @Test
    public void getSquareCuba() {
        int res = calc.getSquareCuba(7);
        assertEquals(343, res);
    }

}
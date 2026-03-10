package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGradeS() {
        App app = new App();
        assertEquals("S", app.calculateGrade(95));
    }

    @Test
    public void testGradeA() {
        App app = new App();
        assertEquals("A", app.calculateGrade(85));
    }

    @Test
    public void testGradeF() {
        App app = new App();
        assertEquals("F", app.calculateGrade(30));
    }
}

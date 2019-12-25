package com.test;

import com.company.LetterGrade;
import com.company.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {
    Main main;
    LetterGrade letterGrade;

    @BeforeEach
    void setUp() {
        main = new Main();
        letterGrade = new LetterGrade();
    }

    @AfterEach
    void tearDown() {
        main = null;
        letterGrade = null;
    }

    @Test
    void LetterGradeTest1() {
        assertEquals(LetterGrade.letterGrade(75), 'C');
        assertEquals(LetterGrade.letterGrade(63), 'D');
        assertEquals(LetterGrade.letterGrade(54), 'F');
        assertEquals(LetterGrade.letterGrade(101), 'X');
        assertEquals(LetterGrade.letterGrade(91), 'A');
        assertEquals(LetterGrade.letterGrade(88), 'B');
        assertEquals(LetterGrade.letterGrade(-1), 'X');
    }

    @Test
    void LetterGradeTest2() {
        assertEquals(LetterGrade.letterGrade(101), 'X');
        assertEquals(LetterGrade.letterGrade(100), 'A');
        assertEquals(LetterGrade.letterGrade(90), 'A');
        assertEquals(LetterGrade.letterGrade(89), 'B');
        assertEquals(LetterGrade.letterGrade(70), 'C');
        assertEquals(LetterGrade.letterGrade(71), 'C');
        assertEquals(LetterGrade.letterGrade(89), 'B');
        assertEquals(LetterGrade.letterGrade(69), 'D');
        assertEquals(LetterGrade.letterGrade(59), 'F');
        assertEquals(LetterGrade.letterGrade(1), 'F');
        assertEquals(LetterGrade.letterGrade(0), 'F');
        assertEquals(LetterGrade.letterGrade(-1), 'X');
    }
}
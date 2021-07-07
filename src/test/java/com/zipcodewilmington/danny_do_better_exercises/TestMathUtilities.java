package com.zipcodewilmington.danny_do_better_exercises;

import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestAddition;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestDivision;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestMultiplication;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestSubtraction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAddition.class,
        TestSubtraction.class,
        TestDivision.class,
        TestMultiplication.class
})
public class TestMathUtilities {

//    @Test
//    public void add() {
//        MathUtilities math = new MathUtilities();
//        int x = 4;
//        int y = 6;
//        int expectedResult = 10;
//        int actualResult = math.add(x, y);
//        assertEquals(expectedResult, actualResult);
    }
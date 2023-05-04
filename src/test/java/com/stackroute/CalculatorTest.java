package com.stackroute;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator;




    @BeforeAll
    public static void setUpBeforeClass(){
        System.out.println("Before ALl Method");
    }
    @AfterAll
    public static void tearDownClass(){
        System.out.println("After all the class");
    }


    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
        System.out.println("Before Every Methods");
    }
    @AfterEach
    public void tearDown(){
        calculator = null;
        System.out.println("After Every Method");
    }


    @Tag("Dev")
    @Test
    @DisplayName("GivenNumberShouldReturnMultipleOfTwoNumbers")
    @Order(1)
    @RepeatedTest(4)
    public void givenNumberShouldReturnMultipleOfTwoNumbers(){
        int result = calculator.multiply("4","5");
        assertEquals(20,result,"number should return 20");
    }

     @Test
     @Order(3)

    public void givenIntegerAndAStringThrowNumberFormatException(){
//        int actualResult = calculator.multiply("4","a");
       assertThrows(NumberFormatException.class,()-> calculator.multiply("4","b"));
    }

    @Test
      public void givenNumberShouldBeGreaterThenZero(){
        assertThrows(IllegalArgumentException.class,()->calculator.multiply("-1","6"));
    }

    @Test
    @Order(2)

    public void givenStringAndNullShouldReturnErrorMessage(){
        String concated = calculator.concateTwoString("Hello",null);
        assertEquals("String cannot be null",concated);
    }




    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,-10})
    public void givenvaluesShouldreturnTrueForEvenValue(int number){
       assertTrue(calculator.isEven(number));
    }

    @Test
    public void givenListShouldReturnSizeOfList(){
        int size = Calculator.list.size();
        assertEquals(3,size);
    }

    @Test
    public void giveIndexTest(){
        String name = Calculator.list.get(0);
        assertEquals("Ram",name);
    }

    @Test
    public void testArray(){
        int len = Calculator.array.length;
        assertEquals(4,len);
    }
}

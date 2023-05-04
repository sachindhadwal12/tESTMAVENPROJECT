package com.stackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergerSampleTest {
    int[] series1=new int[] {12,34,5};
    MergerSample sample=new MergerSample(series1);

    @Test
    public void mergeArraySuccess()
    {
        int[] series2=new int[] {51,89,6};

        int[] actualArray=sample.mergeRecord(series2);
        int[] expectedArray=new int[] {12,34,5,51,89,6};

        assertArrayEquals(expectedArray,actualArray);

    }
}
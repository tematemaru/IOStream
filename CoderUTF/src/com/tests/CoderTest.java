package com.company;

import org.junit.Test;

import static org.junit.Assert.*;


public class CoderTest {

    @Test
    public void testCode()throws Exception{
   String s = Coder.read("res//input.txt");
        System.out.println(s);
    }

}
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testGreet(){
        assertEquals("Hello, World!", App.greet("World")); // this is the command i added
    }

    @Test
    public void testAdd(){
        assertEquals(5, App.add(2, 3));
        assertEquals(0, App.add(-1, 1));
    }

    @Test
    public void testSubtract(){
        assertEquals(1, App.subtract(3, 2));
        assertEquals(-2, App.subtract(1, 3));
    }
}

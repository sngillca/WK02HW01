package com.example.wk02hw01;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void testUserA() {
        assertEquals(0, Utils.checkUser("alice", "otter123"));
    }


    @Test
    public void testUserB() {
        assertEquals(0, Utils.checkUser("ben", "jerry000"));
    }

    @Test
    public void testUserC() {
        assertEquals(0, Utils.checkUser("elon", "tusk"));
    }

}

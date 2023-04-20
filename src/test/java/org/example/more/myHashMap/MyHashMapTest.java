package org.example.more.myHashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {
    private MyHashMap<String, Integer> map;
    @BeforeEach
    void setUp() {
        map = new MyHashMap<>();
    }

    @Test
    void testPut() {
        assertNull(map.put("Key1", 1));
        assertEquals(1, map.size());
    }


}
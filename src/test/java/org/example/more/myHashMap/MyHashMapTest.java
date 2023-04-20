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
        assertNull(map.put("Key2", 1));
        assertNull(map.put("Key3", 1));
        assertNull(map.put("apple", 1));
        assertEquals(4, map.size());
    }

    @Test
    void testPutReplace() {
        map.put("Key1", 1);
        assertEquals(Integer.valueOf(1), map.put("Key1", 2));
        assertEquals(1, map.size());

    }
    @Test
    void testGet() {
        map.put("Key1", 1);
        map.put("Key2", 2);
        assertEquals(Integer.valueOf(1), map.get("Key1"));
        assertEquals(Integer.valueOf(2), map.get("Key2"));
    }
    @Test
    void testRemove() {
        map.put("Key1", 1);
        map.put("Key2", 2);
        assertEquals(Integer.valueOf(1), map.remove("Key1"));
        assertNull(map.remove("Key3"));
        assertEquals(1, map.size());
    }

    @Test
    void testSize() {
        map.put("Key1", 1);
        map.put("Key2", 2);
        map.put("Key3", 3);
        assertEquals(3, map.size());
    }
    @Test
    void testContainsKey() {
        map.put("Key1", 1);
        map.put("Key2", 2);
        assertTrue(map.containsKey("Key1"));
        assertFalse(map.containsKey("Key3"));
    }

}
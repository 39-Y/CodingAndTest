package org.example.more.Make_List;

import org.assertj.core.api.Assertions;
import org.example.more.StudyGroup.week2.q1_SqrtSort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    private MyList list;

    @BeforeEach
    void setUp() {
        list = new MyList<>();
    }
    @Test
    @DisplayName("MyList add & get")
    void testAdd() {
        assertTrue(list.add("Element1"));
        Assertions.assertThat(list.size()).isEqualTo(1);
        Assertions.assertThat("Element1").isEqualTo(list.get(0));
    }

    @Test
    @DisplayName("MyList add 20 times")
    void Add_20Times() {
        for(int i=0; i<20; i++){
            list.add(i);
        }
        //System.out.println(list);
        Assertions.assertThat(list.size()).isEqualTo(20);
        Assertions.assertThat(0).isEqualTo(list.get(0));
    }


    @Test
    void testRemove() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        assertEquals("Element2", list.remove(1));
        assertEquals(null, list.get(2));
        System.out.println(list);

        assertEquals(2, list.size());
    }

    @Test
    void testGet() {
        list.add("Element1");
        list.add("Element2");
        assertEquals("Element1", list.get(0));
        assertEquals("Element2", list.get(1));
        assertEquals(null, list.get(2));

    }

    @Test
    void testSize() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        assertEquals(3, list.size());
    }

    @Test
    void testContains() {
        list.add("Element1");
        list.add("Element2");
        assertTrue(list.contains("Element1"));
        assertFalse(list.contains("Element3"));
    }

    @Test
    void testIndexOf() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element1");
        assertEquals(0, list.indexOf("Element1"));
        assertEquals(1, list.indexOf("Element2"));
        assertEquals(-1, list.indexOf("Element3"));
    }

    @Test
    void testClear() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }
}
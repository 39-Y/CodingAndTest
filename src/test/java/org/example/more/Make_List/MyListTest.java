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
    @DisplayName("MyList add 21 times")
    void Add_21Times() {
        assertTrue(list.add("Element1"));
        for(int i=0; i<20; i++){
            list.add(i);
        }
        Assertions.assertThat(list.size()).isEqualTo(1);
        Assertions.assertThat("Element1").isEqualTo(list.get(0));
    }

}
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;
    private List<Subject> subjects;

    @BeforeEach
    public void setUp() {
        subjects = new ArrayList<>();
        subjects.add(new Subject("Math", 5));
        subjects.add(new Subject("Science", 10));


        student = new Student("John Doe", 20, 3.8f, true, 'J', subjects);
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(20, student.getAge());
    }

    @Test
    public void testGetGpa() {
        assertEquals(3.8f, student.getGpa(), 0.01f);
    }

    @Test
    public void testIsGraduated() {
        assertTrue(student.isGraduated());
    }

    @Test
    public void testGetInitial() {
        assertEquals('J', student.getInitial());
    }

    @Test
    public void testGetSubjects() {
        assertEquals(subjects, student.getSubjects());
    }


}

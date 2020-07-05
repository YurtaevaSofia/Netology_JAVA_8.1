package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancerTest {

    @Test
    void shouldCreateConditioner() {
        Conditioner conditioner = new Conditioner();
    }

    @Test
    void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expectedName = "Кондей";
        assertNull(conditioner.getName());
        conditioner.setName(expectedName);
        assertEquals("Кондей", conditioner.getName());
    }

    @Test
    void shouldChangeFields() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());

    }
}
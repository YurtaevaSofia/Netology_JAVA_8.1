package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldCreateConditioneer() {
        Conditioner conditioner = new Conditioner();
    }

    @Test
    void shouldCheckConditioner() {
        Conditioner conditioner = new Conditioner();
        assertNull(conditioner.name);
        assertEquals(0, conditioner.maxTemperature);
        assertEquals(0, conditioner.minTemperature);
        assertEquals(0, conditioner.currentTemperature);
        assertFalse(conditioner.on);
    }

    @Test
    @Disabled
    void shouldCheckNPEStatus() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.name.length());
    }

    @Test
    void shouldChangeFields() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.currentTemperature);
        conditioner.currentTemperature = -200;
        assertEquals(-200, conditioner.currentTemperature);

    }
}
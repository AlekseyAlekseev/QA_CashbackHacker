package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldTestRemainAverageAmount() {

        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainBelowTheBorder() {

        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainAverageTheBorder() {

        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainFullAmount() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainAmountZero() {

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainAmountBelowZero() {

        int amount = -100;
        int actual = service.remain(amount);
        int expected = 1100;

        assertEquals(actual, expected);
    }
}
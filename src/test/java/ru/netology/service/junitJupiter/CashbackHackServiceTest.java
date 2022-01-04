package ru.netology.service.junitJupiter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldTestRemainAverageAmount() {

        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldTestRemainBelowTheBorder() {

        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainAverageTheBorder() {

        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainFullAmount() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainAmountZero() {

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainAmountBelowZero() {

        int amount = -100;
        int actual = service.remain(amount);
        int expected = 1100;

        assertEquals(expected, actual);
    }

}

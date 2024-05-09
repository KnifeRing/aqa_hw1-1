package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;


public class CashBackHackServiceTest {

    CashbackHackService cashBackHacker = new CashbackHackService();

    @Test
    public void testRemainLessThanBoundary() {
        int amount = 500;
        int expected = 500;
        int actual = cashBackHacker.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainEqualToBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainGreaterThanBoundary() {
        int amount = 1500;
        int expected = 500;
        int actual = cashBackHacker.remain(amount);
        assertEquals(expected, actual);
    }
}
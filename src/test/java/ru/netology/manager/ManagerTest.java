package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    @Test
    void isOutputCorrect() {
        Manager managerNoArg = new Manager();
        Manager.exePosterResult();
        assertEquals(Manager.posterLot.length, Manager.posterResult.length);
    }

    @Test
    void isEmptyRequare() {
        Manager managerEmpty = new Manager(0);
        Manager.exePosterResult();
        assertEquals(0, Manager.posterResult.length);
    }

    @Test
    void isRequareOverLimit() {
        Manager managerOver = new Manager(11);
        Manager.exePosterResult();
        assertEquals(10, Manager.posterResult.length);
    }

    @Test
    void isMaxRequare() {
        Manager managerMax = new Manager(10);
        Manager.addLot(5);
        Manager.exePosterResult();
        assertEquals(10, Manager.posterResult.length);
    }

    @Test
    void isOneRequare() {
        Manager managerLow = new Manager(1);
        Manager.addLot(5);
        Manager.exePosterResult();
        assertEquals(1, Manager.posterResult.length);
    }

    @Test
    void isAvgRequare() {
        Manager managerAvg = new Manager(5);
        Manager.exePosterResult();
        assertEquals(5, Manager.posterResult.length);

    }

}

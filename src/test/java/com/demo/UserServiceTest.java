
package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void testGetUserName() {
        assertEquals("Arhan", userService.getUserName("Arhan"));
    }

    @Test
    void testNullUserNameExposesBug() {
        assertThrows(
            NullPointerException.class,
            () -> userService.getUserName(null)
        );
    }

    @Test
    void testCalculateDiscount() {
        assertEquals(
            900.0,
            userService.calculateDiscount(1000, 10),
            0.01
        );
    }

    @Test
    void testInvalidPrice() {
        assertEquals(0.0, userService.calculateDiscount(-100, 10));
    }
}

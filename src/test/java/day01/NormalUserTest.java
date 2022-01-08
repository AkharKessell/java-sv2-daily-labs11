package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalUserTest {
    @Test
    void testNormalUserCreate() {
        User normalUser = new NormalUser("johndoe@gmail.com", "12345");
        assertEquals("johndoe@gmail.com", normalUser.getUserEmail());
        assertEquals("12345", normalUser.getPassword());
    }
}
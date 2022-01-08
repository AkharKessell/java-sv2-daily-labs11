package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AdminUserTest {

    @Test
    void testAdminUserCreate() {
        User adminUser = new AdminUser("test@gmail.com", "54321");
        assertEquals("test@gmail.com", adminUser.getUserEmail());
        assertEquals("*****", adminUser.getPassword());
        assertNotEquals("******", adminUser.getPassword());
    }
}
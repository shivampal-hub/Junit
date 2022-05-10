package com.bl.registration;

import com.bl.UserRegistrationUC3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    static UserRegistrationUC3 registration;

    @Before
    public void createObject() {

        registration = new UserRegistrationUC3();
        System.out.println("Before");

    }

    @Test
    public void testValidFirstNameFirstLetterCapital_thenTrue() {

        System.out.println("Test : Valid First Name With First Letter Capital");
        Assert.assertTrue(registration.isValidFirstName("Shivam"));

    }

    @Test
    public void testValidFirstNameFirstLetterCapitalMinThreeChar_thenTrue() {

        System.out.println("Test : Valid First Name With First Letter Capital and min Three Char");
        Assert.assertTrue(registration.isValidFirstName("Shi"));

    }

    @Test
    public void testValidLastNameFirstLetterCapital_thenTrue() {

        System.out.println("Test : Valid Last Name With First Letter Capital");
        Assert.assertTrue(registration.isValidLastName("Pal"));

    }

    @Test
    public void testValidLastNameFirstLetterCapitalMinThreeChar_thenTrue() {

        System.out.println("Test : Valid Last Name With First Letter Capital and min Three Char");
        Assert.assertTrue(registration.isValidLastName("Pal"));

    }

    @Test
    public void testValidEmail_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("shivamm.ppal@gmail.com"));

    }
}

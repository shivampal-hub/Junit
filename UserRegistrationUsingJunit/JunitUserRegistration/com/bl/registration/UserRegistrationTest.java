package com.bl.registration;

import com.bl.UserRegistrationUC1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    static UserRegistrationUC1 registration;

    @Before
    public void createObject() {
        registration = new UserRegistrationUC1();
        System.out.println("Before");
    }

    @Test
    public void testValidFirstName_thenTrue() {

        System.out.println("Test : Valid First Name");
        Assert.assertTrue(registration.isValidFirstName("Shivam"));
    }

}

package com.stackroute;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    @BeforeEach
    public void setUp(){
        person = new Person("Jerry","password",23);
    }

    @Test
    public void givenuserNameShouldreturntheuserName(){
            assertEquals(person.getUserName(),"Jerry");
    }

    @Test
    public void givenPasswordShouldreturnThePasword(){
        assertEquals(person.getPassword(),"password");
    }

   @Test
    public void giveUserNameShouldNotBeNull(){
         assertNotNull(person.getPassword());
   }

   @Test
    public void giveUserNullIsNullAndShouldReturnErrorMessage(){

        assertEquals("UserName or Password Cannot be Null",person.validate(null,"password"));

   }

   @Test
    public void giveUserNameAndPasswordShouldNotBeNull(){
    assertAll("userName and Password cannot be Empty",() ->assertNotNull(person.getUserName()),
            ()->assertNotNull(person.getPassword()));
   }


   @Test
    public void giveNegativeValueShouldThrowNeagtiveAgeException(){
       person.setAge(-10);
      Exception exception =assertThrows(NegativeAgeException.class,()->person.checkAge());
      assertEquals("Age cannot be -ve",exception.getMessage());
   }

    @Test
    public void whenAdminuserSuccess() {
        person.setUserName("Anu");
        person.setPassword("password");
        assertAll("check admin user with not null inputs",
                () -> {
                    assertNotNull(person.getUserName());

                    assertAll("admin user message is not valid",
                            () -> assertEquals("Normal User", person.validate(person.getUserName(), person.getPassword())),
                            () -> assertEquals(true, person.checkPassword())

                    );

                }

        );
    }
}
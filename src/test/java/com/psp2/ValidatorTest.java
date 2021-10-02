package com.psp2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    Validator validator;

    @BeforeEach
    void setUp() {
        validator =  new Validator();
    }
    @Test
    void passwordChecker_passwordLengthTest(){
        String password = "ggg123";
        assertTrue(validator.validatePassword(password));
    }
    @Test
    void passwordChecker_passwordContainsUppercaseTest(){
        String password = "Ggg123";
        assertTrue(validator.validatePassword(password));
    }
    @Test
    void passwordChecker_passwordContainsSpecialSymbolTest(){
        String password = "ggg123";
        assertTrue(validator.validatePassword(password));
    }
    @Test
    void phoneValidator_numberLengthTest(){
        String number = "   ";
        assertTrue(validator.validatePhone(number));
    }
    @Test
    void phoneValidator_numberContainsCorrectSymbolsTest(){
        String number = "555ggg";
        assertTrue(validator.validatePhone(number));
    }
    @Test
    void phoneValidator_numberPrefixTest(){
        String number = "8487432";
        assertTrue(validator.validatePhone(number));
    }
    @Test
    void emailValidator_emailContainsEtaTest(){
        String email = "test@gmail.com";
        assertTrue(validator.validateEmail(email));
    }
    @Test
    void emailValidator_emailContainsCorrectSymbolsTest(){
        String email = "test@gmail.com";
        assertTrue(validator.validateEmail(email));
    }
    @Test
    void emailValidator_emailDomainTest(){
        String email = "test@gmail.com";
        assertTrue(validator.validateEmail(email));
    }
    @Test
    void emailValidator_emailTLDTest(){
        String email = "test@gmail.com";
        assertTrue(validator.validateEmail(email));
    }
    @AfterEach
    void tearDown() {
    }
}
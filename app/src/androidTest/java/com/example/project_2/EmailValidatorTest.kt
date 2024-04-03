package com.example.project_2

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun isValidEmail_CorrectFormat_ShouldReturnTrue() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun isValidEmail_CorrectSubdomainFormat_ShouldReturnTrue() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun isValidEmail_IncorrectDomainFormat_ShouldReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun isValidEmail_DoubleDotsFormat_ShouldReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun isValidEmail_WithoutUsernameFormat_ShouldReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun isValidEmail_WithoutDomainFormat_ShouldReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun isValidEmail_EmptyStringFormat_ShouldReturnFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun isValidEmail_NullFormat_ShouldReturnFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}

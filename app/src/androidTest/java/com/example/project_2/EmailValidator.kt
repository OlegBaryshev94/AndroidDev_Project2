package com.example.project_2

object EmailValidator {

    fun isValidEmail(email: String?): Boolean {
        if (email == null) {
            return false
        }
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
package com.myapp.catatuang.test

class Helper {

    fun isInputFieldEmpty(input: String?): Boolean {
        return input == null || input.trim().isEmpty()
    }

    fun isInputFieldValidLength(input: String?, minLength: Int, maxLength: Int): Boolean {
        return !isInputFieldEmpty(input) && input!!.trim().length in minLength..maxLength
    }

    fun isInputFieldNumeric(input: String?): Boolean {
        return !isInputFieldEmpty(input) && input!!.matches("-?\\d+(\\.\\d+)?".toRegex())
    }

    fun isInputFieldEmail(input: String?): Boolean {
        return !isInputFieldEmpty(input) && android.util.Patterns.EMAIL_ADDRESS.matcher(input!!).matches()
    }
}

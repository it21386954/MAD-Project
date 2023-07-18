package com.myapp.catatuang.test

import java.text.SimpleDateFormat

class Validator {

    fun isValueGreaterOrEqualToZero(value: Int): Boolean {
        return value >= 0
    }

    fun isNumberOrString(value: Any): Boolean {
        return when (value) {
            is Int, is Long, is Double, is Float -> true
            is String -> value.toDoubleOrNull() != null
            else -> false
        }
    }



    fun isDate(text: String): Boolean {
        // Define the date format
        val dateFormat = SimpleDateFormat("dd/MM/yyyy")
        dateFormat.isLenient = false

        try {
            // Parse the text as a date
            val date = dateFormat.parse(text)

            // Check if the parsed date is not null
            return date != null
        } catch (e: Exception) {
            // If there is an exception, the text is not a valid date
            return false
        }
    }

}
package com.example.hw_7

class Math {

    fun add(a: String, b: String): String {
        var result = ""
        val regex = Regex("[a-zA-Z]+")
        if (((isNumeric(a) || !isNumeric(b)) && a.contains(".") || b.contains("."))) {
            result = (a.toBigDecimal() + b.toBigDecimal()).toString()
        } else if (((isNumeric(a) || !isNumeric(b)) && regex.containsMatchIn(a) || regex.containsMatchIn(
                b
            ))
        ) {
            result = "Нельзя вводить буквы"
        } else {
            result = (a.toBigDecimal() + b.toBigDecimal()).toString()
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""
        if (b.contains("0")) {
            result = "На ноль делить нельзя"
        } else if (b == "0") {
            result = "поля не может быть пустым"
        } else if (b.isEmpty()) {
            result = "Должно быть число"
        } else {
            result = (a.toBigDecimal() / b.toBigDecimal()).toString()
        }
        return result
    }

    fun isNumeric(str: String) = str.all { it in '0'..'9' }
}
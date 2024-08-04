package com.example.test

fun safeDivide(a: Int?, b: Int?): Int? = runCatching {
    requireNotNull(a)
    requireNotNull(b)
    a / b
}.getOrNull()

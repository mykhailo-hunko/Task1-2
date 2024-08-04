package com.example.test

/**
 * It's wasn't specified in the task, so I decided do it only for EN language.
 * If the user of this code will need add language it can be added(or replaced) in "aeiou" string.
 */
fun String.countVowels(): Int = count { it.lowercase() in "aeiou" }
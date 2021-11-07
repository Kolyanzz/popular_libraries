package com.kolumbo.popular_libraries

class CountersModel {

    val counters = mutableListOf(0, 0, 0)

    fun getCurrent(int: Int): Int {
        return counters[int]
    }

    fun next(int: Int): Int {
        counters[int]++
        return getCurrent(int)
    }

    fun set(int: Int, value: Int) {
        counters[int] = value
    }
}
package com.anggapambudi.dependencyinjection.data

import android.content.Context

class SaveCounter(context: Context) {

    companion object {
        const val PREF_NAME = "data_counter"
        const val COUNTER = "counter"
    }

    val pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    var counter: Int
        set(value) {
            val editor = pref.edit()
            editor?.putInt(COUNTER, value)
            editor?.apply()
        }
        get() = pref.getInt(COUNTER, 0)
}
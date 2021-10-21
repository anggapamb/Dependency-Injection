package com.anggapambudi.step2.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.anggapambudi.step2.data.SaveCounter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (private val saveCounter: SaveCounter) : ViewModel() {

    var counter = ObservableField(0)

    fun increaseCounter() {
        saveCounter.counter = saveCounter.counter + 1
        sendValue()
    }

    fun decreaseCounter() {
        saveCounter.counter = saveCounter.counter - 1
        sendValue()
    }

    fun sendValue() {
        counter.set(saveCounter.counter)
    }

}
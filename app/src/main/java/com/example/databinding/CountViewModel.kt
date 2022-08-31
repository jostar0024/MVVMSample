package com.example.databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private val _count = MutableLiveData(0)
    val count:LiveData<Int> = _count

    fun onCountUpButtonClick() {
        _count.value = (_count.value ?: 0) + 1
    }
}
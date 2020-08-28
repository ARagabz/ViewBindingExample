package com.ragabz.viewbindingexample.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    val name = MutableLiveData<String>()

    fun changeName(value: String) {
        name.value = value
    }

}
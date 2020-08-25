package com.ragabz.viewbindingexample.common

import android.content.Context
import android.view.View
import android.widget.Toast

inline fun View.onClick(crossinline action: () -> Unit) {
    this.setOnClickListener { action.invoke() }
}

fun Context.longToast(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()

fun Context.shortToast(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
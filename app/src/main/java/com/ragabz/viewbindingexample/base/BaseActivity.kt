package com.ragabz.viewbindingexample.base

import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import net.matsudamper.viewbindingutil.inflateViewBinding

open class BaseActivity<T : ViewBinding> : AppCompatActivity() {
    lateinit var binding: T
}
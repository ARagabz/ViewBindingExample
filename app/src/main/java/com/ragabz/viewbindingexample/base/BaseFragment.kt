package com.ragabz.viewbindingexample.base

import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseFragment<T: ViewBinding>: Fragment() {

    lateinit var binding: T

}
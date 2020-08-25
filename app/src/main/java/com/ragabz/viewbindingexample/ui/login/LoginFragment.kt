package com.ragabz.viewbindingexample.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ragabz.viewbindingexample.base.BaseFragment
import com.ragabz.viewbindingexample.databinding.FragmentLoginBinding
import net.matsudamper.viewbindingutil.inflateViewBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding()
        return binding.root
    }
}
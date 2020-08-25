package com.ragabz.viewbindingexample.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ragabz.viewbindingexample.R
import com.ragabz.viewbindingexample.base.BaseFragment
import com.ragabz.viewbindingexample.databinding.FragmentRegisterBinding
import net.matsudamper.viewbindingutil.inflateViewBinding

class RegisterFragment : BaseFragment<FragmentRegisterBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding()
        return binding.root
    }

}
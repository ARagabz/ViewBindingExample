package com.ragabz.viewbindingexample.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ragabz.viewbindingexample.base.BaseFragment
import com.ragabz.viewbindingexample.common.onClick
import com.ragabz.viewbindingexample.databinding.FragmentLoginBinding
import net.matsudamper.viewbindingutil.inflateViewBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    lateinit var viewModel: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        binding.login.onClick {
            viewModel.changeName(binding.username.text.toString())
        }
    }
}
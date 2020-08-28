package com.ragabz.viewbindingexample.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ragabz.viewbindingexample.R
import com.ragabz.viewbindingexample.base.BaseFragment
import com.ragabz.viewbindingexample.databinding.FragmentRegisterBinding
import net.matsudamper.viewbindingutil.inflateViewBinding

class RegisterFragment : BaseFragment<FragmentRegisterBinding>() {

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
        viewModel.name.observe(viewLifecycleOwner, {
            binding.nameMessage.text = it
        })
    }

}
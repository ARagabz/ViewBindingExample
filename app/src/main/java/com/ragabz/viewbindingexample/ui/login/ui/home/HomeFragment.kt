package com.ragabz.viewbindingexample.ui.login.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.ragabz.viewbindingexample.R
import com.ragabz.viewbindingexample.databinding.FragmentHomeBinding
import com.ragabz.viewbindingexample.viewbindingcommons.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var homeViewModel: HomeViewModel
    private val binding by viewBinding(FragmentHomeBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeViewModel = HomeViewModel()
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textHome.text = it
        })
    }
}
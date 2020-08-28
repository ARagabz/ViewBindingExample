package com.ragabz.viewbindingexample.ui.login


import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.ragabz.viewbindingexample.R
import com.ragabz.viewbindingexample.base.BaseActivity
import com.ragabz.viewbindingexample.common.longToast
import com.ragabz.viewbindingexample.common.onClick
import com.ragabz.viewbindingexample.common.shortToast
import com.ragabz.viewbindingexample.databinding.ActivityMainBinding
import net.matsudamper.viewbindingutil.inflateViewBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    lateinit var viewModel: SharedViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindContentView()

        viewModel = SharedViewModel()
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.findNavController()

        binding.btnLogin.onClick {
            navController.navigate(R.id.loginFragment)
        }
        binding.btnRegister.onClick {
            navController.navigate(R.id.registerFragment)
        }
    }

    override fun bindContentView() {
        binding = inflateViewBinding()
        setContentView(binding.root)
    }
}
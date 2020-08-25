package com.ragabz.viewbindingexample.ui.login


import android.os.Bundle
import com.ragabz.viewbindingexample.base.BaseActivity
import com.ragabz.viewbindingexample.common.longToast
import com.ragabz.viewbindingexample.common.onClick
import com.ragabz.viewbindingexample.common.shortToast
import com.ragabz.viewbindingexample.databinding.ActivityMainBinding
import net.matsudamper.viewbindingutil.inflateViewBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding()
        setContentView(binding.root)

        binding.btnLogin.onClick {
            longToast("login clicked")
        }
        binding.btnRegister.onClick { shortToast("register clicked") }
    }
}
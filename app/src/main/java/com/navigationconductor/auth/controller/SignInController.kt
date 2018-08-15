package com.navigationconductor.auth.controller

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.navigationconductor.R
import com.navigationconductor.main.MainActivity
import kotlinx.android.synthetic.main.controller_intro.view.*
import kotlinx.android.synthetic.main.controller_sign_in.view.*

class SignInController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_sign_in, container, false)
        view.signInButton.setOnClickListener({
            startActivity(Intent(activity, MainActivity::class.java))
            activity!!.finish()
        })
        view.gotoRegButton.setOnClickListener({
            router.pushController(RouterTransaction.with(SignUpController()))
        })
        return view
    }
}
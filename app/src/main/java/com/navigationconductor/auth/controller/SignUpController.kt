package com.navigationconductor.auth.controller

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.navigationconductor.R
import com.navigationconductor.main.MainActivity
import kotlinx.android.synthetic.main.controller_sign_up.view.*

class SignUpController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_sign_up, container, false)
        view.signUpButton.setOnClickListener({
            startActivity(Intent(activity, MainActivity::class.java))
            activity!!.finish()
        })
        view.backButton.setOnClickListener({
            router.handleBack()
        })
        return view
    }
}
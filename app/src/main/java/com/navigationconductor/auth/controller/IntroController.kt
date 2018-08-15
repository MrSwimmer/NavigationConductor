package com.navigationconductor.auth.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.navigationconductor.R
import kotlinx.android.synthetic.main.controller_intro.view.*

class IntroController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_intro, container, false)
        view.helloButton.setOnClickListener({
            router.replaceTopController(RouterTransaction.with(SignInController()))
        })
        return view
    }
}
package com.navigationconductor.main.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.navigationconductor.R
import kotlinx.android.synthetic.main.controller_intro.view.*

class SettingsController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_settings, container, false)
        return view
    }
}
package com.navigationconductor.main.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.navigationconductor.R
import com.navigationconductor.main.controller.post.PostController
import kotlinx.android.synthetic.main.controller_news.view.*

class NewsController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_news, container, false)
        view.postButton.setOnClickListener({
            router.pushController(RouterTransaction.with(PostController("1")))
        })
        return view
    }
}
package com.navigationconductor.main.controller.post

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.hannesdorfmann.mosby3.mvp.conductor.MvpController
import com.navigationconductor.R
import kotlinx.android.synthetic.main.controller_intro.view.*
import kotlinx.android.synthetic.main.controller_post.view.*

class PostController() : MvpController<PostContract.View, PostContract.Presenter>(),PostContract.View {

    lateinit var id: String

    constructor(id: String) : this() {
        this.id = id
    }

    override fun createPresenter(): PostContract.Presenter {
        return PostPresenter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_post, container, false)
        view.postId.text = id
        return view
    }

    override fun onAttach(view: View) {
        super.onAttach(view)
        presenter.doSomething()
    }

    override fun setSomeOnView() {
        //do something with view
    }
}
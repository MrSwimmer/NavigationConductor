package com.navigationconductor.main.controller.post

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter

class PostPresenter : MvpBasePresenter<PostContract.View>(), PostContract.Presenter {
    override fun doSomething() {
        something()
        view.setSomeOnView()
    }

    private fun something() {

    }
}
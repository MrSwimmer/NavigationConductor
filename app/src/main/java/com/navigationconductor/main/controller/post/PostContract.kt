package com.navigationconductor.main.controller.post

import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView

interface PostContract {
    interface View : MvpView {
        fun setSomeOnView()
    }
    interface Presenter : MvpPresenter<View> {
        fun doSomething()
    }
}
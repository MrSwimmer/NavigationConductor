package com.navigationconductor.auth

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.RouterTransaction
import com.navigationconductor.R
import com.navigationconductor.auth.controller.IntroController
import com.navigationconductor.main.MainActivity
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        val router = Conductor.attachRouter(this, auth_container, savedInstanceState)
        if (isSignedIn()) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            router.setRoot(RouterTransaction.with(IntroController()))
        }
    }

    private fun isSignedIn(): Boolean {
        return false
    }
}
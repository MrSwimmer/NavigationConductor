package com.navigationconductor.main

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.navigationconductor.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_header.view.*
import kotlinx.android.synthetic.main.toolbar.*
import com.bluelinelabs.conductor.RouterTransaction
import com.navigationconductor.main.controller.NewsController
import com.navigationconductor.main.controller.SettingsController


class MainActivity : AppCompatActivity() {

    lateinit var drawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val router = Conductor.attachRouter(this, main_container, savedInstanceState)
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(NewsController()))
        }
        setupDrawerContent(router)
        setSupportActionBar(toolbar)
        drawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close)
        drawerLayout.addDrawerListener(drawerToggle)
        val header = navView.getHeaderView(0)
        header.shareButton.setOnClickListener({})
    }

    private fun setupDrawerContent(router: Router) {
        navView.setCheckedItem(0)

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_news -> router.setRoot(RouterTransaction.with(NewsController()))
                R.id.nav_settings -> router.setRoot(RouterTransaction.with(SettingsController()))
                else -> router.setRoot(RouterTransaction.with(NewsController()))
            }
            menuItem.isChecked = true
            title = menuItem.title
            drawerLayout.closeDrawers()
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (drawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        drawerToggle.onConfigurationChanged(newConfig)
    }
}

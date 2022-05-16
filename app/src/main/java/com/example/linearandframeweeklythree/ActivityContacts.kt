package com.example.linearandframeweeklythree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.linearandframeweeklythree.R

class ActivityContacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ActivityTwo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        title = ""
        actionBarSetting()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun actionBarSetting() {
        val ab = supportActionBar
        ab?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.contacts, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
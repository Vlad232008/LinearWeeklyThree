package com.example.linearandframeweeklythree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.graphics.toColor
import com.example.linearandframeweeklythree.R

class BeginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ActivityThree)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin)
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
}
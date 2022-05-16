package com.example.linearandframeweeklythree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOne.setOnClickListener {
            startActivity(Intent(this,PlayActivity::class.java))
        }
        btnTwo.setOnClickListener {
            startActivity(Intent(this, ActivityContacts::class.java))
        }
        btnThree.setOnClickListener {
            startActivity(Intent(this, Calculator::class.java))
        }
        btnFour.setOnClickListener {
            startActivity(Intent(this, BeginActivity::class.java))
        }
    }
    /*
    D/MyLog: Отрисовка плеера: 128024693
    D/MyLog: Отрисовка контакта телеграмма: 122444154
    D/MyLog: Отрисовка калькулятора: 109064847
    D/MyLog: Отрисовка входа: 81490308
    */
}
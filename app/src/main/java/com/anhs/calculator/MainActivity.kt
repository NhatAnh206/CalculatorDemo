package com.anhs.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.caculator.Calculator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frg= Calculator()
        val tran = supportFragmentManager.beginTransaction()
        tran.add(R.id.frg_cal, frg)
        tran.commit()
    }
}

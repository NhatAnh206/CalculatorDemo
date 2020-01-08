package com.anhs.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentCalculator = Calculator()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragmentCalculator, fragmentCalculator)
        transaction.commit()
    }
}

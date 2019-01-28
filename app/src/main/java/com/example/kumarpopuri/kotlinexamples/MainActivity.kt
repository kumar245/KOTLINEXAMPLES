package com.example.kumarpopuri.kotlinexamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        print("ONstart")
    }

    override fun onResume() {
        super.onResume()
        print("ONRestart")
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        print("ONRESUme")
    }

    override fun onPause() {
        super.onPause()
    }

}

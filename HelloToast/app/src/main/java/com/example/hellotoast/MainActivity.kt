package com.example.hellotoast

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
        updateCountText()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT).show()
    }
    fun countUp(view: View) {
        mCount++;
        updateCountText()
    }

    private fun updateCountText() {
        mShowCount.text = mCount.toString()
    }
}
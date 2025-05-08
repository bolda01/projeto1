package com.bolda.ciclovida

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val info: String="INFO"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("INFO", "onCreate")
    }

    override fun onStart(){
        super.onStart()

        Log.i("INFO", "onStart")
    }
    override fun onResume(){
        super.onResume()

        Log.i("INFO", "onResume")
    }
    override fun onPause(){
        super.onPause()

        Log.i("INFO", "onPause")
    }
    override fun onStop(){
        super.onStop()

        Log.i("INFO", "onStop")
    }
    override fun onDestroy(){
        super.onDestroy()

        Log.i("INFO", "onDestroy")
    }
}

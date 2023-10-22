package com.example.simplecalculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun numberAction(view: View){}
    fun operationAction(view: View) {}
    fun allClearAction(view: View)
    {
//        workingTV.text = ""
    }
    fun backSpaceAction(view: View) {}
    fun  equalsAction(view: View) {}
}
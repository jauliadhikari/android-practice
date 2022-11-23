package com.example.sumapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 : EditText =findViewById(R.id.num1)

        var num2 : EditText = findViewById(R.id.num2)

        val b :Button = findViewById(R.id.button)
        b.setOnClickListener {
            solve()
        }

    }

    private fun solve()
    {

        var num1 : EditText =findViewById(R.id.num1)

        var num2 : EditText = findViewById(R.id.num2)

        var res : TextView = findViewById(R.id.textView)

        val n  = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()

        var ans = n+n2

        res.text = "$ans"

        Toast.makeText(this, "$ans", Toast.LENGTH_SHORT).show()
    }


    }




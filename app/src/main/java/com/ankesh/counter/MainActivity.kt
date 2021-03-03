package com.ankesh.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
var a=0;
var b=0;
var c=0;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val A =findViewById(R.id.AA) as TextView
        val B =findViewById(R.id.BB) as TextView
        val C =findViewById(R.id.CC) as TextView
        val btn1 = findViewById(R.id.button) as Button
        btn1.setOnClickListener{
            a++
            Toast.makeText(this@MainActivity,"A increment",Toast.LENGTH_SHORT).show()
            A.text=a.toString()
        }
        val btn2 = findViewById(R.id.button1) as Button
        btn2.setOnClickListener{
            b++
            Toast.makeText(this@MainActivity,"B increment",Toast.LENGTH_SHORT).show()
            B.text=b.toString()
        }
        val btn3 = findViewById(R.id.button2) as Button
        btn3.setOnClickListener{
            c++
            Toast.makeText(this@MainActivity,"C increment",Toast.LENGTH_SHORT).show()
            C.text=c.toString()
        }

    }
}
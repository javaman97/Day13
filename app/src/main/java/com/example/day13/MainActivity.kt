package com.example.day13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    // creating key
    companion object{
        const val KEY = "com.example.day13.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOrder: Button =findViewById(R.id.btnOrder)
        val eT1: EditText =findViewById(R.id.eT1)
        val eT2: EditText =findViewById(R.id.eT2)
        val eT3: EditText =findViewById(R.id.eT3)
        val eT4: EditText =findViewById(R.id.eT4)
        btnOrder.setOnClickListener {

            val ordersPlaced= eT1.text.toString() + " " + eT2.text.toString() + " "+
                    eT3.text.toString() + " " + eT4.text.toString()

            intent= Intent(this, Order::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)
        }
    }


}
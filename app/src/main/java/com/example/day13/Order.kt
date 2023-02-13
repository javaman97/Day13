package com.example.day13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCustomer= intent.getStringExtra(MainActivity.KEY)

        val tVOrder=findViewById<TextView>(R.id.tVOrder)
        tVOrder.text=ordersOfCustomer.toString()
    }
}
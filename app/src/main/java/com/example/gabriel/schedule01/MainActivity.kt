package com.example.gabriel.schedule01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thedate: TextView = findViewById(R.id.date)
        val btngocalendar: Button = findViewById(R.id.btngocalendar)
        val incoming = getIntent()
        val date = incoming.getStringExtra("date")

        thedate.setText(date)


        btngocalendar.setOnClickListener {
            val intent = Intent(this@MainActivity, Calendar::class.java)
            startActivity(intent)
        }
    }
}



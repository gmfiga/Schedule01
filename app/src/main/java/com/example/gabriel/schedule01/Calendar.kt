package com.example.gabriel.schedule01

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.CalendarView

class Calendar : AppCompatActivity() {

    private val mCalendarView : CalendarView = findViewById(R.id.calendarView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)


    mCalendarView.setOnDateChangeListener {view, year, month, dayOfMonth ->

            val intent = Intent(this@Calendar, TaskList::class.java)
            startActivity(intent)
        }
    }
}



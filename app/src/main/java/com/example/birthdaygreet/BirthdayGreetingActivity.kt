package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    lateinit var birthdayGreeting : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        birthdayGreeting = findViewById(R.id.birthdayGreeting)

        val userName = intent.getStringExtra("name")

        birthdayGreeting.setText(userName)


    }
}
package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var nameInput : EditText
    lateinit var createBirthdayButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.nameInput)
        createBirthdayButton = findViewById(R.id.createBirthdayButton)

        createBirthdayButton.setOnClickListener {
            val name = nameInput.text.toString()

            val intent = Intent(this@MainActivity,BirthdayGreetingActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }

    }

}

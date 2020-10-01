package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        val name = nameInput.editableText.toString()

        if(name == "") {
            Toast.makeText(this , "Please Enter Name" , Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent (this , BirthdayCardActivity::class.java)
            intent.putExtra(BirthdayCardActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}

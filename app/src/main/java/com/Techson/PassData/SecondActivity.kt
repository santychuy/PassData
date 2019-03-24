package com.Techson.PassData

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getData()

    }


    private fun getData(){
        val name = tvName
        val email = tvEmail
        val phone = tvPhone

        var intent = intent
        val namePassed = intent.getStringExtra("Name")
        val emailPassed = intent.getStringExtra("Email")
        val phonePassed = intent.getStringExtra("Phone")

        name.text = "My Name is: $namePassed"
        email.text = "My Email is: $emailPassed"
        phone.text = "My Phone is: $phonePassed"
    }

}

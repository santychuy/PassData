package com.Techson.PassData

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configEditTexts()
    }


    private fun configEditTexts(){

        val nameField = edName
        val emailField = edEmail
        val phoneField = edPhone
        val btnSave = btnSave

        btnSave.setOnClickListener {
            if (nameField.text.isEmpty() && emailField.text.isEmpty() && phoneField.text.isEmpty()) {
                Toast.makeText(this, "Necesitas llenar los parametros", Toast.LENGTH_SHORT).show()
            }else{

                val name = nameField.text.toString()
                val email = emailField.text.toString()
                val phone = phoneField.text.toString()

                val intent = Intent(this, SecondActivity::class.java)

                intent.putExtra("Name", name)
                intent.putExtra("Email", email)
                intent.putExtra("Phone", phone)

                startActivity(intent)

            }
        }


    }

}

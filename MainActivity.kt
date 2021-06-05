 package com.example.signinlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnSignUp: Button
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castingViews()
        onclickListener()
    }
     fun castingViews(){
         etEmail=findViewById(R.id.etEmail)
         btnLogin=findViewById(R.id.btnLogin)
         btnSignUp=findViewById(R.id.btnSignUp1)
         etPassword=findViewById(R.id.etPassword)

     }
     fun onclickListener(){
         if (etEmail.text.toString().isEmpty()||(etPassword.text.toString().isEmpty())){
             etEmail.error = "Enter email"
             etPassword.error = "Enter Password"
         }
         var message="Welcome Back!"
         btnLogin.setOnClickListener {
             Toast.makeText(baseContext,message,Toast.LENGTH_LONG).show()
         }
        btnSignUp.setOnClickListener {
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }

     }

}
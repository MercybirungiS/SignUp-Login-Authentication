package com.example.signinlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    lateinit var btnSignUp2:Button
    lateinit var etName:EditText
    lateinit var etPassword:EditText
    lateinit var etEmail:EditText
    lateinit var etPhone:EditText
    lateinit var spGender :Spinner




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        castViews()
        onclickListener()
    }

    fun castViews(){
        btnSignUp2 =findViewById(R.id.btnSignUp2)
        etName=findViewById(R.id.tilName2)
        etPassword=findViewById(R.id.tilPassword)
        etPhone=findViewById(R.id.tilPhone)
        etEmail=findViewById(R.id.tilEmail)

        spGender=findViewById(R.id.spGender)

        var genders = arrayOf("Female","Male","Other")
        var genderAdapter = ArrayAdapter<String>(baseContext,android.R.layout.simple_dropdown_item_1line,genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spGender.adapter = genderAdapter
    }
    fun onclickListener(){
        var gender = spGender.toString()
        if(etName.text.toString().isEmpty()||(etPassword.text.toString().isEmpty()||(etPhone.text.toString().isEmpty()||(etEmail.text.toString().isEmpty())))){
            etName.setError("Enter name")
            etPassword.setError("Enter password")
            etEmail.setError("Enter Email")
            etPhone.setError("Enter number")
        }
        var message="Thanks for signing up"
        btnSignUp2.setOnClickListener {
            Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
        }

    }

}
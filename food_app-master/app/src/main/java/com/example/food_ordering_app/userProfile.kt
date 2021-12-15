package com.example.food_ordering_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class userProfile : AppCompatActivity() {
    lateinit var session:SessionManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        val updateemail=findViewById<Button>(R.id.changeEmail)
        val emailId= findViewById<TextView>(R.id.userEmailDis)
        val reviewHistory=findViewById<Button>(R.id.HistoryReview)
        session= SessionManager(this)
        emailId.text="${session.FetchUserID()}"
        updateemail.setOnClickListener {
            val intent=Intent(this,update_email::class.java)
            startActivity(intent)
        }
        reviewHistory.setOnClickListener{
            val intent1=Intent(this,LoginHistory::class.java)
            startActivity(intent1)
        }
    }
}
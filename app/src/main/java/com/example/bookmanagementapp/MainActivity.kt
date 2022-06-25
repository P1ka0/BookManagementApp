package com.example.bookmanagementapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookmanagementapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    //View Binding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Handle Click Login
        binding.loginBtn.setOnClickListener{

            startActivity(Intent(this, LoginActivity::class.java))
        }

        //Handle Click Skip btn
        binding.skipBtn.setOnClickListener {

            startActivity(Intent(this, DashboardUserActivity::class.java))
        }

    }
}
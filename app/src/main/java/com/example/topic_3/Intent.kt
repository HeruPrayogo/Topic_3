package com.example.topic_3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topic_3.databinding.ActivityMainBinding

class Intent : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val getBundle = intent.extras
        val name = getBundle?.getString("nama")
        val age = getBundle?.getInt("umur")
        binding.text.text = "Halo $name, umur kamu adalah $age"




    }
}
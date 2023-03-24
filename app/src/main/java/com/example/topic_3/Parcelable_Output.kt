package com.example.topic_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.topic_3.databinding.ActivityMain3Binding

@Suppress("DEPRECATION")
class Parcelable_Output : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val getData = intent.getParcelableExtra("DATAUSER2") as DataUser2?
        val nama = getData!!.nama
        val email = getData.email
        val Phone = getData.phone
        val Address = getData.address
        val AGE = getData.age
        binding.text.text = nama
        binding.text2.text = email
        binding.text3.text = Phone
        binding.text4.text = Address
        binding.text5.text = AGE


    }
}
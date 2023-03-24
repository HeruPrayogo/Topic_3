package com.example.topic_3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.topic_3.databinding.ActivityParcelableBinding

class Parcelable : AppCompatActivity() {
    lateinit var binding: ActivityParcelableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener{
            val inputNama = binding.uss.text.toString()
            val inputEmail = binding.pass.text.toString()
            val inputPhone =  binding.pass2.text.toString()
            val inputAddress = binding.address.text.toString()
            val inputAGE= binding.Age.text.toString()
            val data = DataUser2(inputNama, inputEmail, inputPhone, inputAddress, inputAGE)
            val pindah = Intent(this, Parcelable_Output::class.java)
            pindah.putExtra("DATAUSER2", data)
            startActivity(pindah)
        }
    }
}
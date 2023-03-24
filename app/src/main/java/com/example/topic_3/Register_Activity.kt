package com.example.topic_3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.topic_3.databinding.ActivityRegisterBinding

class Register_Activity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            val inputNama = binding.uss.text.toString()
            val inputEmail = binding.pass.text.toString()
            val inputPhone =  binding.pass2.text.toString()
            val inputAddress = binding.address.text.toString()
            val inputAGE= binding.Age.text.toString()
            val data = DataUser(inputNama, inputEmail, inputPhone, inputAddress, inputAGE)
            val pindah = Intent(this, Serializable::class.java)
            pindah.putExtra("DATAUSER", data)
            startActivity(pindah)
        }
    }
}
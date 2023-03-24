

package com.example.topic_3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.topic_3.databinding.ActivityMain2Binding

@Suppress("DEPRECATION")
class Serializable : AppCompatActivity() {
        lateinit var binding: ActivityMain2Binding
        @SuppressLint("SetTextI18n")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMain2Binding.inflate(layoutInflater)
            setContentView(binding.root)
            val getData = intent.getSerializableExtra("DATAUSER") as DataUser
            val nama = getData.nama
            val email = getData.Email
            val Phone = getData.Phone
            val Address = getData.Address
            val AGE = getData.Age
            binding.text.text = nama
            binding.text2.text = email
            binding.text3.text = Phone
            binding.text4.text = Address
            binding.text5.text = AGE
            

        }
    }


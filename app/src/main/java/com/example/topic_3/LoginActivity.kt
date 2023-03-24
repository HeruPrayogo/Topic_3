package com.example.topic_3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.topic_3.databinding.ActivityLoginBinding




class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val nama = binding.uss.text.toString()
            val umur = binding.pass.text.toString().toInt()
            val bundle = Bundle()
            val pindah = Intent(this, Intent::class.java)
            bundle.putString("nama", nama)
            bundle.putInt("umur", umur)
            pindah.putExtras(bundle)
            startActivity(pindah)
        }


    }
}



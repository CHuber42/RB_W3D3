package com.example.firstkotlinproject.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.firstkotlinproject.R
import com.example.firstkotlinproject.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var JokeType : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding = ActivityMainBinding.inflate(LayoutInflater)
//        setContentView(binding.root)

    }

    fun onRadioButtonClicked(view: View){
        when (view.id) {
            R.id.rb_any -> JokeType = "Any"
            R.id.rb_christmas -> JokeType = "Christmas"
            R.id.rb_dark -> JokeType = "Dark"
            R.id.rb_misc -> JokeType = "Miscellaneous"
            R.id.rb_programming -> JokeType = "Programming"
            R.id.rb_pun -> JokeType = "Pun"
            R.id.rb_spooky -> JokeType = "Spooky"
            else -> {
                JokeType = "Any"
            }
        }
    }
}
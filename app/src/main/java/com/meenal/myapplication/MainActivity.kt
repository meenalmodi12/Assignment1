package com.meenal.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meenal.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var counter = 0
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        myButtonClicked()
        setContentView(view)
    }

    private fun myButtonClicked() {
        binding.myButton.setOnClickListener {
            counter++
            binding.myText.text = "Counter: $counter"
        }
    }

    override fun onStart() {
        counter = 0
        myButtonClicked()
        super.onStart()
    }

    override fun onStop() {
        counter = 0
        binding.myText.text = "Counter: $counter"
        super.onStop()
    }
}
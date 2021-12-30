package com.example.myappdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.myappdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    //  implementation 'androidx.fragment:fragment-ktx:1.4.0'
    val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.sampleButton.setOnClickListener {
//            Toast.makeText(this, binding.inputText, Toast.LENGTH_LONG).show()
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
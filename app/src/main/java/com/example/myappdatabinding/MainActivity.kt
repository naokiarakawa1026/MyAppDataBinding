package com.example.myappdatabinding

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myappdatabinding.databinding.ActivityMainBinding
import com.example.myappdatabinding.databinding.ListExampleBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    //  implementation 'androidx.fragment:fragment-ktx:1.4.0'
    val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val adapter = MainListAdapter(this).apply {
            add(ListItem("ゴミ出し", Date()))
            add(ListItem("技術書を書く", Date()))
            add(ListItem("脱稿する", Date()))
        }

        _binding = ActivityMainBinding.inflate(layoutInflater)
        binding.listView.adapter = adapter
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
package com.example.myappdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myappdatabinding.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)

        with(binding) {
            buttonKinoko.setOnClickListener {
                binding.kinoko += 1
            }

            buttonTakenoko.setOnClickListener {
                binding.takenoko += 1
            }
        }
        
        return binding.root
    }

}
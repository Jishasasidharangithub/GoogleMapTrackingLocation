package com.jisha.googlemaptrackinglocation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jisha.googlemaptrackinglocation.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity() {
    private var binding : ActivityMapBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
    }
}
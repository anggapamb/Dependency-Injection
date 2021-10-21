package com.anggapambudi.dependencyinjection.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.anggapambudi.dependencyinjection.R
import com.anggapambudi.dependencyinjection.data.SaveCounter
import com.anggapambudi.dependencyinjection.databinding.ActivityMainBinding
import com.anggapambudi.dependencyinjection.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModel.Factory(SaveCounter(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //set viewModel
        binding.viewModel = viewModel
        viewModel.sendValue()

    }
}
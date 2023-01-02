package com.ranggacikal.daggereample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.ranggacikal.daggereample.R
import com.ranggacikal.daggereample.databinding.ActivityMainBinding
import com.ranggacikal.daggereample.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
        observeFootballClub()
    }

    private fun setupView() = with(binding) {
        rvFootballClub.layoutManager = LinearLayoutManager(this@MainActivity)
    }

    private fun observeFootballClub() {
        viewModel.footballClub.observe(this) {
            binding.rvFootballClub.adapter = FootballAdapter(it)
        }
    }
}
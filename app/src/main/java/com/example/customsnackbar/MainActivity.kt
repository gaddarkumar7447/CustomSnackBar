package com.example.customsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customsnackbar.databinding.ActivityMainBinding
import com.example.snackbar.SnackBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.success.setOnClickListener {
            SnackBar.success(binding.root, "Successfully SnackBar :)", SnackBar.LENGTH_LONG).show()
        }

        binding.warning.setOnClickListener {
            SnackBar.warning(binding.root, "Warning SnackBar :)", Snackbar.LENGTH_LONG).show()
        }
        binding.danger.setOnClickListener {
            SnackBar.error(binding.root, "Danger SnackBar :)", Snackbar.LENGTH_LONG).show()
        }

        binding.info.setOnClickListener {
            SnackBar.info(binding.root, "Info SnackBar :)", Snackbar.LENGTH_LONG).show()
        }

        binding.networkError.setOnClickListener {
            SnackBar.networkError(binding.root, "Network SnackBar :)", Snackbar.LENGTH_LONG).show()
        }
    }
}
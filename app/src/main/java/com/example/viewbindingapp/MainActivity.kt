package com.example.viewbindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.viewbindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(LayoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.printBtn.setOnClickListener {
            if (mainBinding.edTitle.text.toString().isEmpty()) {
                mainBinding.edTitle.setError("Required")
            } else if (mainBinding.edDesc.text.toString().isEmpty()) {
                mainBinding.edDesc.error = "Required"
            } else {
                mainBinding.titleTxt.text = mainBinding.edTitle.text.toString()
                mainBinding.descTxt.text = mainBinding.edDesc.text.toString()
            }
        }
    }
}
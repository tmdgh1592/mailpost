package com.app.umc.mailpost.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.umc.mailpost.R
import com.app.umc.mailpost.databinding.ActivityLetterTemporaryBinding

class LetterTemporaryActivity : AppCompatActivity() {

    lateinit var binding: ActivityLetterTemporaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_letter_temporary)

        with(binding) {

        }
    }
}
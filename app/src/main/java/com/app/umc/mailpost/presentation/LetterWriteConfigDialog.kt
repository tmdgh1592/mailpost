package com.app.umc.mailpost.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.umc.mailpost.databinding.DialogLetterWriteConfigBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class LetterWriteConfigDialog : BottomSheetDialogFragment() {
    lateinit var binding: DialogLetterWriteConfigBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogLetterWriteConfigBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {

        }
    }
}
package com.example.notepadroom.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notepadroom.databinding.FragmentAboutWeBinding

class AboutWeFragment : Fragment() {

    private lateinit var binding: FragmentAboutWeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAboutWeBinding.inflate(inflater, container, false)

        binding.btnKanal.setOnClickListener {
            startActivity(
                Intent.parseUri(
                    "https://t.me/Programmers_Dasturchi",
                    Intent.URI_ALLOW_UNSAFE
                )
            )
        }

        binding.btnGuruh.setOnClickListener {
            startActivity(
                Intent.parseUri(
                    "https://t.me/Cpp_java_dasturlash",
                    Intent.URI_ALLOW_UNSAFE
                )
            )
        }

        binding.btnBot.setOnClickListener {
            startActivity(
                Intent.parseUri(
                    "https://t.me/programmersQuiz_bot",
                    Intent.URI_ALLOW_UNSAFE
                )
            )
        }

        binding.btnBoshqa.setOnClickListener {
            startActivity(
                Intent.parseUri(
                    "https://t.me/ProgrammersPortfolio",
                    Intent.URI_ALLOW_UNSAFE
                )
            )
        }

        binding.btnMuallif.setOnClickListener {
            startActivity(Intent.parseUri("https://t.me/AbdullayevZohid", Intent.URI_ALLOW_UNSAFE))
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AboutWeFragment().apply {
                arguments = Bundle().apply {

                }
            }

    }
}
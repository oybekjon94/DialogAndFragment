package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),FirstFragmentInterfase {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = FirstFragment().apply {
            arguments  = Bundle().apply{
                putString("key","Assalomu aleykum")
            }

        }
        val secondFragment = SecondFragment().apply {
            arguments = Bundle().apply {
                putString("key","Va aleykum Assalom")
            }
        }
        binding.showFirstFragment.setOnClickListener {
            supportFragmentManager.apply {
                beginTransaction().replace(R.id.containerView,firstFragment).addToBackStack(null).commit()
            }
        }

            supportFragmentManager.apply {
                beginTransaction().replace(R.id.containerView,firstFragment).addToBackStack(null).commit()
            }

        binding.showSecondFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.containerView,secondFragment).addToBackStack(null).commit()
        }
    }

    override fun onClickButton(text: String) {
        val secondFragment = SecondFragment().apply {
            arguments = Bundle().apply {
                putString("key",text)
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.containerView,secondFragment).addToBackStack(null).commit()

    }
}
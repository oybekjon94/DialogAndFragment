package com.example.fragments

import android.content.Context
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.StyleRes
import com.example.fragments.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    val TAG = "Fragment first"

    lateinit var textView: TextView
    private var _binding:FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private var sharedString:String? = null
    private lateinit var interfase:FirstFragmentInterfase
    override fun onAttach(context: Context) {
        super.onAttach(context)
        interfase = activity as MainActivity
        Log.d(TAG, "onAttach: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedString = arguments?.let {
            it.getString("key")
        }
        Log.d(TAG,"onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume: ")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG,"onVIewCreated")
        binding.button.setOnClickListener {
            val text = binding.textEt.text.toString()
            interfase.onClickButton(text)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"onDetach: ")
    }


}
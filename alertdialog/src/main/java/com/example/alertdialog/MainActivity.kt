package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import com.example.alertdialog.databinding.ActivityMainBinding
import com.example.alertdialog.databinding.CustomDialogViewBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogBtn.setOnClickListener {
            val dialogViewBinding = CustomDialogViewBinding.inflate(layoutInflater, null, false)
            val dialog = AlertDialog.Builder(this)
                .setView(dialogViewBinding.root)
                .create()

            dialogViewBinding.signBtn.setOnClickListener {
                Log.d(
                    "dialog",
                    ":${dialogViewBinding.userNameEt.text} ${dialogViewBinding.userEmailEt.text}"
                )
                dialog.dismiss()
            }

            dialog.show()
        }
    }
}
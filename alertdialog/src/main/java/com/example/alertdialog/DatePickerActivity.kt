package com.example.alertdialog

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.alertdialog.databinding.ActivityDatePickerBinding
import com.example.alertdialog.databinding.ActivityMainBinding

class DatePickerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatePickerBinding

    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityDatePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showDatePickerBtn.setOnClickListener {

            val calendar = Calendar.getInstance()
            val datePickerDialog = DatePickerDialog(
                this, 0,
                DatePickerDialog.OnDateSetListener { _, year, month, day ->
        binding.selectDateTv.text = "$day/${month + 1}/$year"
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
            calendar.set(Calendar.DAY_OF_MONTH,10)
            datePickerDialog.datePicker.maxDate = calendar.timeInMillis
            calendar.set(Calendar.DAY_OF_MONTH,4)
            datePickerDialog.datePicker.minDate = calendar.timeInMillis

            datePickerDialog.show()
            datePickerDialog.getButton(DatePickerDialog.BUTTON_POSITIVE).text = "Tanla"
        }
    }
}
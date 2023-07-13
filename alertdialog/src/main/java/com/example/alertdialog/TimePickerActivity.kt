package com.example.alertdialog

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alertdialog.databinding.ActivityTimePickerBinding
import java.util.Calendar
import kotlin.math.min

class TimePickerActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTimePickerBinding
    private var selectedHour = 0
    private var selectedMinute = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val calendar = Calendar.getInstance()
        selectedHour = calendar.get(Calendar.HOUR)
        selectedMinute = calendar.get(Calendar.MINUTE)

        binding.showTimePickerBtn.setOnClickListener {
            val timePickerDialog =
                TimePickerDialog(this,
                    TimePickerDialog.OnTimeSetListener{_,hour,minute ->
                        selectedHour = hour
                        selectedMinute = minute
                        binding.selectedTimeTv.text = "$selectedHour:$selectedMinute"

            },selectedHour,selectedMinute,true)

            timePickerDialog.show()
        }
    }
}
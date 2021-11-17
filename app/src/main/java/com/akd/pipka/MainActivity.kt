package com.akd.pipka

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.EditText
import android.view.Display
import android.view.View
import android.widget.Switch
import android.widget.TextView
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import java.util.*
import kotlin.system.measureTimeMillis

private var a:Int = 0
private lateinit var dis:Display
private var cnt:Int = 0
private var pass:Boolean = false
private var clchange:Boolean = false
private lateinit var txt:TextView
private lateinit var b0:Switch
private lateinit var b1:Switch
private lateinit var b2:Switch
private lateinit var b3:Switch
private lateinit var b4:Switch
private lateinit var b5:Switch
private lateinit var b6:Switch
private lateinit var b7:Switch
private lateinit var out:EditText
private lateinit var timer:Timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timer.start();
        b0 = findViewById(R.id.bit0)
        b0.setOnClickListener{
            recount()
        }
        b1 = findViewById(R.id.bit1)
        b1.setOnClickListener{
            recount()
        }
        b2 = findViewById(R.id.bit2)
        b2.setOnClickListener{
            recount()
        }
        b3 = findViewById(R.id.bit3)
        b3.setOnClickListener{
            recount()
        }
        b4 = findViewById(R.id.bit4)
        b4.setOnClickListener{
            recount()
        }
        b5 = findViewById(R.id.bit5)
        b5.setOnClickListener{
            recount()
        }
        b6 = findViewById(R.id.bit6)
        b6.setOnClickListener{
            recount()
        }
        b7 = findViewById(R.id.bit7)
        b7.setOnClickListener{
            recount()
        }
        out = findViewById(R.id.editTextNumber)
    }
    private fun recount(){
        var result:Int = 0
        out = findViewById(R.id.editTextNumber)
        if (b0.isChecked) result++
        if (b1.isChecked) result+=2
        if (b2.isChecked) result+=4
        if (b3.isChecked) result+=8
        if (b4.isChecked) result+=16
        if (b5.isChecked) result+=32
        if (b6.isChecked) result+=64
        if (b7.isChecked) result+=128

        out.setText(result.toString())
    }

    fun pilik() {
        timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {

            }

        })
    }
}

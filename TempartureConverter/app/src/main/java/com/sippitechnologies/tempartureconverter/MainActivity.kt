package com.sippitechnologies.tempartureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Formula Fahrenheit to celsius= (temperature-32) *5/9
        //Formula Celsius to Fahrenheit (temperature*9/5)+32

        button.setOnClickListener{
            val result = when(radioGroup.checkedRadioButtonId)
            {
                R.id.radioButton2-> (editText3.text.toString().toDouble()-32) *5/9
                else-> (editText3.text.toString().toDouble()*9/5)+32
            }
            textView2.text=result.toString()
        }


    }
}

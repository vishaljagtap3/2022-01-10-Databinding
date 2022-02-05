package com.bitcode.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.bitcode.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        /*binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.activity_main,
            null,
            false
        )
        setContentView(binding.root)*/
        binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)


        binding.user = User("Vishal", R.drawable.samar1, 2009)
       /* binding.name = "Vishal"
        binding.imageId = R.drawable.samar1*/


    }
}


@BindingAdapter("marks")
fun setGradeToUserTextView(textView : TextView, marks : String) {

    Log.e("tag", "binding adapter fun called..")
    Toast.makeText(textView.context, "Binding Adapter called", Toast.LENGTH_LONG).show()
    when {
        marks.toDouble() < 40 -> textView.setText("Fail")
        marks.toDouble() > 40 -> textView.setText("pass")
    }
}
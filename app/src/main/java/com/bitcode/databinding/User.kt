package com.bitcode.databinding

import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.databinding.BindingAdapter

data class User(
    var name : String,
    var imageId : Int,
    var birthYear : Int
)


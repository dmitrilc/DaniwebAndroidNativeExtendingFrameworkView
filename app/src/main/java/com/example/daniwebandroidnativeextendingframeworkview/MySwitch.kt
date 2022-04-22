package com.example.daniwebandroidnativeextendingframeworkview

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.Switch

@SuppressLint("UseSwitchCompatOrMaterialCode")
class MySwitch(context: Context, attrs: AttributeSet) : Switch(context, attrs){
    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.MySwitch,
            0, 0
        ).use {
            it.getString(R.styleable.MySwitch_customAttribute)
        }
    }
}

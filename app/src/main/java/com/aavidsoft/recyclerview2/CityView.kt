package com.aavidsoft.recyclerview2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class CityView(context : Context, attributeSet: AttributeSet? = null) : LinearLayout(context, attributeSet){

    private lateinit var imgCity : ImageView
    private lateinit var txtCityName : TextView
    private lateinit var txtCityState : TextView

    var city : City? = null
    set(value) {
        if(value == null) {
            return
        }
        field = value

        imgCity.setImageResource(field!!.imageId)
        txtCityName.setText(field!!.name)
        txtCityState.setText(field!!.state)
    }

    init {

        var view = LayoutInflater.from(context).inflate(R.layout.city_view, null)
        this.addView(view)

        imgCity = view.findViewById(R.id.imgCity)
        txtCityName = view.findViewById(R.id.txtCityName)
        txtCityState = view.findViewById(R.id.txtState)

       /* imgCity = ImageView(context)
        imgCity.layoutParams = LayoutParams(150, 150)
        this.addView(imgCity)

        txtCityName = TextView(context)
        txtCityName.layoutParams = LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        txtCityName.setTextSize(25F)
        txtCityName.setPadding(20, 10, 20, 10)
        this.addView(txtCityName)

        txtCityState = TextView(context)
        txtCityState.layoutParams = LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        txtCityState.setTextSize(20F)
        txtCityState.setPadding(20, 10, 20, 10)
        this.addView(txtCityState)*/
    }
}
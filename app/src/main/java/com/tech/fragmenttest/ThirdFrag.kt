package com.tech.fragmenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class ThirdFrag:Fragment() {


    var btn: Button?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view=LayoutInflater.from(context).inflate(R.layout.three,container,false)

        btn=view.findViewById(R.id.button)

        btn?.setOnClickListener {
            Toast.makeText(activity,"fragment button clicked",Toast.LENGTH_SHORT).show()
        }

        return view
    }
}